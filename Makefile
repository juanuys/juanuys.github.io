.PHONY: new run publish

all: run

new:
	@./new.sh

run:
	#@./run.sh
	# bundle install
	bundle exec jekyll serve

publish:
	@./publish.sh
