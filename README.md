# To_do_list_web_application

A simple web application that allows you to create and manage to-do items. Made with Angular, SpringBoot and MySql.

Requirements to run the application:

* Node.js 8+
* Java 8
* Angular/cli (Install with sudo npm install -g @angular/cli@7.0.4)
* Angular/material (Install with sudo npm install @angular/material@7.0.2 @angular/cdk@7.0.2)
* Angular-devkit (Install with npm install --save-dev @angular-devkit/build-angular)
* MySql Server installed and ready to use (Follow this tutorial https://support.rackspace.com/how-to/install-mysql-server-on-the-ubuntu-operating-system/)
* Maven (Install with sudo apt install maven)

To run:

From terminal in /To_do_list_web_application run the execution script with "bash -x ExecutionScript.sh"
The script will configure the database, run the server with maven and run the front with angular.

In case of problems you can run the server and the front manually:

* In /To_do_list_web_application/server run "mvn spring-boot::run"
* In /To_do_list_web_application/client run "ng serve"

You can create a database and an user to use in Mysql with:

* "CREATE DATABASE IF NOT EXISTS DB_TODO;"
* "CREATE USER 'SPRINGUSER'@'LOCALHOST' IDENTIFIED BY 'THEPASSWORD';"
* "GRANT ALL ON *.* TO 'SPRINGUSER'@'LOCALHOST' IDENTIFIED BY 'THEPASSWORD';"

When you run the script you need to put your linux password for sudo and after that, the password of root user of MySql.

To stop the application press "cntrl + c" on the terminal

Made by Joshua Corino.
Contact: joshuc98@gmail.com