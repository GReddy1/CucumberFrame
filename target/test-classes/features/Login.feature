Feature: Validty the login testleaf application
Scenario: Login with positive Credentionals 
Given Open the Chrome Browser
And Load the url
And Enter the userName as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on the submit button
Then HomePage should be display


Scenario: Login with Invalid Credentionals 
Given Open the Chrome Browser
And Load the url
And Enter the userName as 'Demo'
And Enter the password as 'crmsfa'
When Click on the submit button
But Error Massage should display