Feature: Login Page
Validating Login Page

@invalidcredentials
Scenario: Login with invalid user username and invalid password
Given User navigate to login page
When User enters invalid username
And Enter invalid password
And Clicks login button
Then User should get invalid credentials validation message

@emptycredentials
Scenario: Login with empty user username and password
Given User navigate to login page
When User does not enters username
And User does not enter password
And Clicks login btn
Then User should get proper credentials validation message