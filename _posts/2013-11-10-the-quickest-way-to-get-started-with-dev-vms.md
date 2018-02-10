---
title: "A webwords Chef cookbook"
description: "A webwords Chef cookbook"
date: 2013-11-10
og_image_url: "http://www.gravatar.com/avatar/c22bbf2aac2a3841d80f5363d73e3ebe.png?s=512"
image: "http://www.gravatar.com/avatar/c22bbf2aac2a3841d80f5363d73e3ebe.png?s=512"
image_content_type: "image/jpeg"
layout: post
tags: tech
category: blog
---


There are a lot of [new examples](http://typesafe.com/activator/templates) up on the Typesafe website, a few with the word "Reactive" in them to drive home the [credo](http://www.reactivemanifesto.org/) behind the framework. One of my favourite examples, however, seem to have been demoted but still remains one of my favourites: [webwords](https://github.com/typesafehub/webwords).

[The old Heroku link](http://webwords.herokuapp.com/) to the live running instance of webwords does not seem to be up anymore, so I whipped up a quick Chef cookbook with which to spin up your own local instance.

You can find the Github repo [here](https://github.com/opyate/webwords-vm.git). Spin it up and have fun.

*BTW, join us in doing the [Principles of Reactive Programming course](https://www.coursera.org/course/reactive)*

<!--

The original blog post was going to be a guide to getting webwords cookbook working the old fashioned way, but then I discovered Berkshelf and thought it all a bit pointless.

~/C/s/webwords-vm ❯❯❯ du -chs /home/opyate/.rvm/gems/ruby-2.0.0-p247@vagrant
147M    /home/opyate/.rvm/gems/ruby-2.0.0-p247@vagrant
147M    total

Remove these two lines from the newly-generated Vagrantfile:

  config.ssh.max_tries = 40
  config.ssh.timeout   = 120 

These switches have been deprecated.

# Chef server

git clone https://github.com/opscode-cookbooks/chef-server.git
cd chef-server
vagrant plugin install vagrant-berkshelf
vagrant plugin install vagrant-omnibus
vagrant up

Et voila! Now you have a Chef server.

After logging into the Chef server, it shows the following message, which in turn shows a few things I'll definitely check out and bog about at another time, e.g. Juju and Landscape.

<code>
~/V/chef-server git:master ❯❯❯ vagrant ssh                                                                                                                                                                         ✱
Welcome to Ubuntu 12.04.3 LTS (GNU/Linux 3.2.0-55-generic x86_64)

 * Documentation:  https://help.ubuntu.com/

  System information as of Sat Nov  2 20:24:46 UTC 2013

  System load:  1.04              Processes:           137
  Usage of /:   5.0% of 39.37GB   Users logged in:     0
  Memory usage: 65%               IP address for eth0: 10.0.2.15
  Swap usage:   0%                IP address for eth1: 33.33.33.50

  Graph this data and manage this system at https://landscape.canonical.com/

  Get cloud support with Ubuntu Advantage Cloud Guest:
    http://www.ubuntu.com/business/services/cloud

  Use Juju to deploy your cloud instances and workloads:
    https://juju.ubuntu.com/#cloud-precise

0 packages can be updated.
0 updates are security updates.

vagrant@chef-server:~$ 

</code>

You can see your server at https://33.33.33.50 in your web browser to get started. (the sidebar says to log in with 'admin' and 'p@ssw0rd1', in case you missed it).

# Client

Now, turn your workstation into a chef client.

Firstly, we need knife. Since I rarely muddy my *entire* system with Ruby packages, I localise stuff to gemsets:

rvm use 2.0.0-p247@chef-client --create --default
sudo apt-get install ruby-bundler

I then use the following Gemfile, and run 'bundle install' on it:

<todo the gemfile>

See ~/VMs/chef-client
</todo>


I re-iterate the important steps from the [official documentation](http://www.opscode.com/blog/2013/03/11/chef-11-server-up-and-running/):
(please match my steps with the steps on the above blog since I don't provide as much detail)

* copy chef-validator.pem from the chef server to ~/.chef (create the latter if it doesn't exist)

On the chef server, do:

<code>
vagrant@chef-server:~$ sudo cp /etc/chef-server/chef-validator.pem /vagrant/
vagrant@chef-server:~$ sudo cp /etc/chef-server/admin.pem /vagrant/
</code>

Then back in the cloned directory (the directory containing Vagrantfile):

<code>
mv admin.pem chef-validator.pem ~/.chef  
</code>

Add the following to the /etc/hosts:

33.33.33.50 chef-server

In the same folder where we installed the Chef gem, run:

knife configure -i

Output should look like the following:

<pre>
~/V/chef-client ❯❯❯ knife configure -i
WARNING: No knife configuration file found
Where should I put the config file? [/home/opyate/.chef/knife.rb] 
Please enter the chef server URL: [https://annabelle:443] https://chef-server:443
Please enter a name for the new user: [opyate] 
Please enter the existing admin name: [admin] 
Please enter the location of the existing admin's private key: [/etc/chef-server/admin.pem] ~/.chef/admin.pem
Please enter the validation clientname: [chef-validator] 
Please enter the location of the validation key: [/etc/chef-server/chef-validator.pem] ~/.chef/chef-validator.pem
Please enter the path to a chef repository (or leave blank): 
Creating initial API user...
Please enter a password for the new user: 
Created user[opyate]
Configuration file written to /home/opyate/.chef/knife.rb
~/V/chef-client ❯❯❯ 

</pre>

For simplicity, I keep my roles and cookbooks in ~/.chef, so I add the following lines to ~/.chef/knife.rb

<code>

current_dir = File.dirname(__FILE__)
cookbook_path            ["#{current_dir}/cookbooks"]
role_path                ["#{current_dir}/roles"]
</code>

I create my first cookbook with:

knife  cookbook create gulp -C "Juan Uys" -m "opyate@gmail.com" -I mit -r md

(gulp = Gullible Unnatural Language Processor)

knife cookbook role create gulp

...and then add to run_list: "recipe[gulp]"

We'll add our own custom Java recipe which will use different defaults, e.g. version 7 instead of 6.

<todo include Java7 recipe here>

Also, instead of downloading Java7's dependencies (i.e. java and apt), Berkshelf now kicks in and manages the cookbook dependencies for us.

-->
