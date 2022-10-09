# Demo Video 🎥
[![Demo Video](https://img.youtube.com/vi/UHHkfhFdnFA/0.jpg)](https://www.youtube.com/watch?v=UHHkfhFdnFA)
# ASSIGNMENT

Alice is a psychometrician who is getting people to fill her psychometric form. 
Write an api and efficient database structure to store the results of this api.

The api should be written in spring boot with swagger ui enabled. Sample request for the api is attached for reference.
Understanding of hibernate is a bonus.

Understanding the request json:
1. Question 1 and 2 are name and email address
2. Question 3 is a file whose base 64 is passed as the database
3. Question 4 is again a text field
4. Question 5-104 are 100 questions which are radio button whose values can only be item1,item2,item3,item4,item5

Things to keep in mind:
1. One candidate can fill the form multiple times.
2. Api must return some error if it fails to write to database
3. You must provide code as well as sql file in a zip file as a submission for the application