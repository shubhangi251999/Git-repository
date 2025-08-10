Feature: Manage profile functionality

Background:
Given I have logged into the application
And I am at the home page

Scenario: Addition of profile
When I click on add button
And I enter details
Then Profile should get added

Scenario: Updation of profile
When I click on edit button
And I update the data
Then Profile should get updated

Scenario: Deletion of profile
When I click on delete button
Then Profile should get deleted