

Feature: This API updates user activity by specified userId

  Scenario: updates user activity by specified userId

    Given goes to user activity url
    Then updates user activity
    Then check the status code