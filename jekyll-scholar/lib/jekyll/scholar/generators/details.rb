module Jekyll
  class Scholar

    class Details < Page
      include Scholar::Utilities

      def initialize(site, base, dir, entry)
        @site, @base, @dir, @entry = site, base, dir, entry

        @config = Scholar.defaults.merge(site.config['scholar'] || {})

        # Specify a temporary filename for now based upon the citation key. Jekyll
        # will modify this according to the URL template below
        @name = entry.key.to_s.gsub(/[:\s]+/, '_')
        @name << '.html'

        process(@name)
        read_yaml(File.join(base, '_layouts'), config['details_layout'])

        data.merge!(reference_data(entry))
        data['title'] = data['entry']['title'] if data['entry'].has_key?('title')
      end

      def url
        # Reuse the logic in the utilities module for deciding URLs
        details_path_for(@entry)
      end
    end

    class DetailsGenerator < Generator
      include Scholar::Utilities

      safe true
      priority :high

      attr_reader :config

      def generate(site)
        @site, @config = site, Scholar.defaults.merge(site.config['scholar'] || {})
        @cache ||= Jekyll::Cache.new("Jekyll::Scholar::DetailsGenerator")

        # Check for removed option and warn if it is set
        if @config.include? 'use_raw_bibtex_entry'
          Jekyll.logger.warn('Jekyll-scholar:',
                             'Option `use_raw_bibtex_entry` is no longer supported')
        end

        if generate_details?
          entries.each do |entry|
            details = Details.new(site, site.source, File.join('', details_path), entry)

            # on first run, cache miss
            # on subsequent runs, should cache hit
            printf "[jekyll-scholar/details.rb] %s in cache? %s\n".red, details.path, @cache.key?(details.path)
            if @cache.key?(details.path) != true
              @cache[details.path] = 1
            end

            # on first entry, cache miss
            # on subsequent entries (and runs), should cache hit
            if @cache.key?("test-key") != true
              printf "[jekyll-scholar/details.rb] 'test-key' not in cache\n".red
              printf "[jekyll-scholar/details.rb] store 'test-key' in cache\n".red
              @cache["test-key"] = "12345"
            else
              printf "[jekyll-scholar/details.rb] 'test-key' in cache, value is %s\n".red, @cache["test-key"]
            end

            #printf "%s".blue, details
            # renders! this is the most expensive part

            starting = Process.clock_gettime(Process::CLOCK_MONOTONIC)

            if @cache.key?(details.path)
              printf "[jekyll-scholar/details.rb] '%s' in cache\n".red, details.path
              #printf "%s\n", @cache[details.path]
              details.content = @cache[details.path]
            else
              printf "[jekyll-scholar/details.rb] '%s' NOT in cache\n".red, details.path
              details.render(site.layouts, site.site_payload)
              @cache[details.path] = details.content
            end

            ending = Process.clock_gettime(Process::CLOCK_MONOTONIC)
            elapsed = ending - starting

            printf "[jekyll-scholar/details.rb] %s: took %f\n".blue, details.path, elapsed

            ##@cache.getset(details.path) do
            ##  printf "[jekyll-scholar/details.rb] store '%s' in cache\n".red, details.path
            ##  details.render(site.layouts, site.site_payload)
            ##  details
            ##end
            #printf "%s".green, details
            ##printf "[jekyll-scholar/details.rb] %s".red, site.dest

            # this writes the file to the destination
            details.write(site.dest)
            #printf "%s".yellow, details

            # adds a reference to list of pages
            site.pages << details
            #printf "%s".blue, site.pages
          end

        end
      end

    end


  end
end
