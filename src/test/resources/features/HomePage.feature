Feature: Testing homepage functionality

 Scenario: Testing access to all categories
    Given I am on the homepage
    When I click on the category "<category>"
    Then I should be directed to "<url>"