Feature: Validate the login function

Background:
Given Open the chrome
And Load the url

Scenario Outline: Validate with positive and negative crediatial

And Enter username as <username>
And Enter password as <password>
When Click on the submit button
Then Home page should display

Examples:
|username|password|
|'DemoCSR'|'crmsfa'|
|'DemosalesManager'|'crmsfa'|



Scenario: Login with Invalid Credentionals 

And Enter username as 'Demo'
And Enter password as 'crmsfa'
When Click on the submit button
But Error Massage should display

