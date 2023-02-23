Feature: OrangeHRM Login
  Scenario: Logo presence on OrangeHRM home page
    Given I launch the chrome browser
    When I open OrangeHRM home page
    Then I verify that the logo present on page
    And close browser