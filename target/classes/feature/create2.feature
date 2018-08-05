Feature: Create Lead

Background:

Given Open the browser
And Maximize the window
And Enter the URL

@Sanity
Scenario Outline: Lead with Mandatory fields creation


Given ENter the username
And Enter the password
And Click submit button
And Click CRMSFA
And Click Create Lead 
And Enter the company name as <company>
And Enter the first name as <firstname>
And Enter the last name as <lastname>
When click on submit button
Then Verify Lead is created

Examples:

|company|firstname|lastname|
|Acc|Deep|chakravarthi|
|Accenture|Deepan|Sekar|

@Smoke
Scenario: Lead without Mandatory fields creation


Given ENter the username
And Enter the password
And Click submit button
And Click CRMSFA
And Click Create Lead
And Enter the company name as Accenture
And Enter the first name as Deepan
When click on submit button
But Verify Lead is not created