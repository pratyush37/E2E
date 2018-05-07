Feature: Google search

Scenario: Login

Given User is on homeepage
When User_Clicks_On "www.gmail.com"
And User_Enters_Username
Then User_Login
