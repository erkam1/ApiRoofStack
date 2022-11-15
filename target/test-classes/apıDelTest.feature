

Feature: user deletion test

  Scenario: delete a user by id
    Given goes to url with id
    Then deletes the user and checks the status code