Feature: close search

Scenario: Logout

Given User is on homeepage
When User_Clicks_On "www.gmail.com"
And User_Enters_Username
Then User_Logout
