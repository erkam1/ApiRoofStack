


Feature: specific user call
  Scenario: call user with id
    Given call user from url with id
    When check user
    Then check the statüs code