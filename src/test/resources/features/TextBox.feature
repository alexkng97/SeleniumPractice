Feature: TextBox functionality

  Scenario Outline: Enter data into fields
    Given I am on the textbox page
    When I enter details "<fullName>", "<email>", "<currentAddress>", "<permanentAddress>" and click submit
    Then the details should be submitted
    Examples:
    |fullName|email|currentAddress|permanentAddress
    |test    |test@test.com|10 test street|10 test street
