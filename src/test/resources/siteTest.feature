Feature: Web Login

  Scenario Outline: User should able to login with valid phone number
    Given the user is on login page
    When the user enters a valid phone number "<phoneNumber>"
    And hits submit
    When the user receives OTP
    And hits submit
    Then user should be able to login successfully
    Examples:
      | phoneNumber |
      | 4569134697  |

