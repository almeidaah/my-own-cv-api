
# my-own-cv-api
A fun project containing my CV as Public API :)


**Using:** . 

Swagger-ui template( from Swagger-UI github https://github.com/swagger-api/swagger-ui )  
_Java 11(JDK8+ should work as well)_  
_MongoDB as database_  
_Gradle to dependency manager_  
_Spring boot(with spring-data-mongodb)_  

**How to create yours:** . 

1. Star this repository :)  
2. Clone this repo :)  
3. Change class ```MySelfDocsConfig.java``` and put the API basic information.  
4. Change class ```MyOwnCvApplication.java``` and put your information.  
4. Change JS file ```swagger-ui-standalone-preset.js``` and put your LinkedIn(it should be displayed on top of API :) . 
4. Change ```index.html``` file and point to your production URL(In heroku, you should have a public url to put in that place) .  
5. Spring framework should load this information(into mongoDB[see application.properties to details]) when the application starts .  
6. Use Heroku to deploy it! 
7. Share :)
