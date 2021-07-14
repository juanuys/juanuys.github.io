.PHONY: new run publish

all: run

new:
	@./new.sh

runx:
	#@./run.sh
	# bundle install
	bundle exec jekyll serve

run:
	bundle exec jekyll serve --incremental

publish:
	@./publish.sh
