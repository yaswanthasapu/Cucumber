  Feature: Home Module
  Scenario:
    Given User open application
    When User on welcome screen

  Scenario: Verify successfull login
    When User on welcome screen
    Then I login with "joe" and "ml@123"

  Scenario Outline: Verify login
    Then I login with "<username>" and "<password>"
    Examples:
        |username| password|
        | joe    | ml@123  |
        | umar   | ml@123  |

  Scenario: Verify login failed
    Given I entered mu credentials
        |joe|ml@123|
    Then I verify login failed

