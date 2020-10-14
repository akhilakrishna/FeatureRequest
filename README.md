This project provides REST APIs for FeatureRequest management. 
To install the project, use 
mvn clean install 

You can import the project into intellij and run the application. 
After running the application, it listens to port 8080 on localhost. 

For testing the project, you can use the following curl reqests. 

curl --location --request POST 'http://localhost:8080/feature/save' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":2,
    "title":"f2",
    "description":"feature 1",
    "client":"Client A",
    "clientPriority":"1",
    "targetDate":"10-12-2020",
    "productArea":"Policies"
}'


curl --location --request GET 'http://localhost:8080/getFeature/f2'

curl --location --request GET 'http://localhost:8080/features'

curl --location --request GET 'http://localhost:8080/deleteFeature/1'

You can use Postman to run above curl requests. 

To view the data in H2 database, on the browser you can login to : 
 
 http://localhost:8080/h2-console
 Db is : jdbc:h2:mem:demodb
 username and password are default h2 ones. 
 
 
