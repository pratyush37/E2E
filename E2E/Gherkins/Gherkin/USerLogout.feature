Feature: close search

Scenario Outline: Logout

Given User is on homeepage
When User_Clicks_On "www.gmail.com"
And User_Enters_Username
And User_enters passwordsdf
| testuser_1 | Test@153 |
| testuser_2 | Test@9153 |
Then User_Logout

Examples:
| testuser_1 | Test@153 |
| testuser_2 | Test@9153 |
