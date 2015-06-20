# Bill unattended test

## Task

To display a customer's Sky bill, as detailed here:

https://github.com/ldabiralai/bill-unattended-test

## Solution

I have developed a small Grails 3.0.2 application, it uses Spock and Geb for testing and Bootstrap for the UI.

The first step is to get Grails running on your local machine; I find the easiest way to do this is to use [GVM](http://gvmtool.net/). Installing is easy, just run: `curl -s get.gvmtool.net | bash`

Once GVM is installed, start a new terminal window and run: `gvm install grails`

You should now have a functioning Grail installation.

Next grab the source from BitBucket:  `git clone https://bitbucket.org/underachiever/skyunattendedtest.git`

Navigate to the skyunattendedtest directory, here you have 2 options:

* Running the application: `grails run-app`, the application is accessible at [http://localhost:8080/](http://localhost:8080/)

* Testing the application: `grails test-app`
