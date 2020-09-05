!/bin/bash

Q5="SET GLOBAL validate_password_policy=LOW;"
Q1="CREATE DATABASE IF NOT EXISTS db_todo;"
Q2="create user 'springuser'@'localhost' identified by 'ThePassword';"
Q3="GRANT ALL ON *.* TO 'springuser'@'localhost' IDENTIFIED BY 'ThePassword';"
Q4="FLUSH PRIVILEGES;"
SQL="${Q5}${Q1}${Q2}${Q3}${Q4}"
 

sudo mysql -h localhost -u root -p -e "$SQL"

cd client
sudo npm install
ng serve &
cd ..
cd server
mvn spring-boot::run 

