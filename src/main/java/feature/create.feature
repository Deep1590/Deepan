Feature: Create Lead
Scenario: Lead with Mandatory fields creation

Given Open the browser
And Maximize the window
And Enter the URL
And ENter the username
And Enter the password
And Click submit button
And Click CRMSFA
And Click Create Lead
And Enter the company name As Accenture
And Enter the first name
And Enter the last name
When click on submit button
Then Verify Lead is created