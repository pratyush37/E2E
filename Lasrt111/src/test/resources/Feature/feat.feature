Feature: UI feature file

@automated
Scenario: To verify that user is able to select agent name within the filter under Agents(Outgoing Calls) tab
    Given I am logged in as "admin" user
    When I navigate to Outbound Reporting Dashboard page
    And I click "Agents (Outgoing Calls)" tab
    And I click "Filter" button
    And I click "Agent Names" dropdown
    And I click "Clear All" link
    And I click "Select All" link
    Then I should see "Clear All" link