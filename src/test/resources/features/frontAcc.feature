Feature: login functionality
Scenario Outline: To do data driven testing on login functionality
Given User is on login page
When user enters user name as "<un>" & password as "<pwd>" and click on Login Button
Then login "<loginType>" be happen

Examples:
|un      |pwd     |loginType|
|demouser|password|should|
|unser   |pwduni  |login should not happen|
|admin   |admin123|login should not happen|

