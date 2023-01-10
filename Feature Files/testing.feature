Feature: Login Functionality

  Scenario: Check Using Invalid Data
    Given Url should be Launched
    When User Enters UserName and Password
      | Sat |
      | Sat |
    And User Clicks Login Button
    Then Take Screenshot
