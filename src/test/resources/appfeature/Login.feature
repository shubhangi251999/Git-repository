 Feature: Login functionality validation
Scenario: Login with valid credentials
Given I am at the login page
When I enter the username
And I enter the password
And I click on login button
Then I should be able to login
Scenario: validation of title of page
Given user should be at login page
Then page title should be displayed