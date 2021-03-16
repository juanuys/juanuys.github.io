.PHONY: new run publish

all: run

new:
	@./new.sh

run:
	#@./run.sh
	# bundle install
	bundle exec jekyll serve

runi:
	bundle exec jekyll serve --incremental

publish:
	@./publish.sh
