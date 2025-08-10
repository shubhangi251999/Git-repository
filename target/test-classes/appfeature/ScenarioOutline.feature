Feature: Signup functionality
Background:
Given I have logged into the system
And I am at home page

Scenario Outline: signup to application
Given user is at the signup page
When user enters name as "<name>" on form
And user select gender as "<gender>" with weight is <weight>
And user select the slotnumber as <slotnumber>
Then user gets created

Examples:
| name | gender | slotnumber | weight |
| Eder | Male | 1 | 66.23 |
| Ron | Male | 2 | 56.23 |
| Diana | Female | 3 | 45.6 |
| Alex | Male | 4 | 40.9 |