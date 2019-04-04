PORT=${PORT:-80}

# first step
false && docker run --rm --label=jekyll --name www.opyate.com --volume=$(pwd):/srv/jekyll -it -p 127.0.0.1:$PORT:4000 ruby:2.3 /bin/bash
# then run the commands in .gitlab-ci.yml

# step 2, in another terminal (with the above container running) run this command to get it back:
false && docker commit www.opyate.com opyate.com-jekyll:latest

# step 3, run
docker run --rm --label=jekyll --name www.opyate.com --volume=$(pwd):/srv/jekyll -it -p 127.0.0.1:$PORT:4000 opyate.com-jekyll jekyll serve -s /srv/jekyll/ -H 0.0.0.0


# Why? The hub image installs gems on each run, and the new image has them all (and starts up quicker)
