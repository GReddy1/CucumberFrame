Feature: Validty the login testleaf application
Scenario: Login with positive Credentionals 
Given Open the Chrome Browser
And Load the url
And Enter the userName as DemosalesManager
And Enter the password as Crmsfa
When Click on the submit button
Then HomePage should be display


