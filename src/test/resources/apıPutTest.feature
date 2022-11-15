Feature: This API updates user info by specified userId

  Scenario:update user information based on specified user id

    Given reaches the user by id
    When It assigns the information it brings with the map to the user.
    Then check the status codee