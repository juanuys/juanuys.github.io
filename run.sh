PORT=${PORT:-80}

# if jekyll3.6 below is now available, try with

false && docker run --rm --label=jekyll --name www.opyate.com --volume=$(pwd):/srv/jekyll -it -p 127.0.0.1:$PORT:4000 jekyll/jekyll:3.6 jekyll serve

# then (with the above container running) run this command to get it back:
false && docker commit www.opyate.com opyatejekyll3.6:latest


docker run --rm --label=jekyll --name www.opyate.com --volume=$(pwd):/srv/jekyll -it -p 127.0.0.1:$PORT:4000 opyatejekyll3.6 jekyll serve


# Why? The hub image installs gems on each run, and the new image has them all (and starts up quicker)
