Feature: Testing homepage functionality

 Scenario Outline: Testing access to all categories
    Given I am on the homepage
    When I click on the category "<category>"
    Then I should be directed to "<url>"
   Examples:
   |category|url|
   |Elements|https://demoqa.com/elements|
   |Forms   |https://demoqa.com/forms   |
   |Alerts, Frame & Windows|https://demoqa.com/alertsWindows|
   |Widgets                |https://demoqa.com/widgets      |
   |Interactions           |https://demoqa.com/interaction  |


   Scenario: Testing the logo press
     Given I am on the homepage
     When I click on the logo
     Then I should be directed to the homepage