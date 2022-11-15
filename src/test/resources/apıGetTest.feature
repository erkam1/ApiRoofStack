Feature:get the list of people

  Scenario: get contact list from api
    Given go to desired url
    When show and print contact list
    Then status code should be 200