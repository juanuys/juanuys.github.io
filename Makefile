.PHONY: all new run runx run_local publish run run_incremental

all: run

new:
	@./new.sh

runx:
	#@./run.sh
	# bundle install
	bundle exec jekyll serve

run_local:
	bundle exec jekyll serve --incremental

publish:
	@./publish.sh

run:
	docker-compose up

run_incremental:
	docker-compose -f docker-compose.yml -f docker-compose.incremental.yml up

update:
	docker-compose jekyll run bundle update jekyll