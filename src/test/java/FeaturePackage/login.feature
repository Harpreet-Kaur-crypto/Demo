Feature: Application Login


Scenario Outline: Validating Login
Given Initialise the browser with chrome 
And navigate to "http://qaclickacademy.com/" website
And Click on sign 
When user enter <username> and <password> and click log in
Then verify whether the user successfully logged in
And close all the browsers





Examples: 
|username             |password     |
|tab99@gmail.com      |123456       |
|sidhukaur91@yahoo.com|1234        |