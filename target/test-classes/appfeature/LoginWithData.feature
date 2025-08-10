Feature: Login with data inside the file
Scenario: Login with correct credentials entered
Given user is at the login page
When user enter username as "testusername"
And user enters password as "Test@1234"
And user clicks on 1 login number with text "att"
Then user logged in validated