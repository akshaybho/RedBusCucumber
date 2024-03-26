Feature: Landing onto Homepage

  Background:
    Given I am a user
    When I open the website

  Scenario: User lands onto the homepage successfully
    Then I should be on the homepage
    And I should see the homepage content

  Scenario: User wants to check content from dropdown
    Given I clicks on first dropdown box
    Then I search "Pune" in dropdown
    Then I should verify stops in Pune

  Scenario: User validate swapping
    Then I clicks on first dropdown box
    And I search "Pune" in dropdown
    Given I click on second dropdown box
    Then I search "Solapur" in ToBox dropdown
    Then I swap the cities
    Then I validate cities are swapping

  Scenario: User validate the Page
    Then I click on TrainTickets
    Then I should be on the TrainTicket Homepage

  Scenario: User select the next day
    Then I click on calendar
    And select date for next day

