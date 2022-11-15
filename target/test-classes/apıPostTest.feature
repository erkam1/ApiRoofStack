Feature: user creation

  Scenario: create user using post with api

    Given goes to the desired url and pulls the user information with map
    When status code should be 200ok