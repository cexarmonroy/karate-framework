Feature: Put user on reqres

  Scenario: Put a user
    Given url "https://reqres.in" + "/api/users/" + "2"
    And request { "name": "Cesar","job":"TAE"}
    When method put
    Then status 200
    And match response.name == 'Cesar'


