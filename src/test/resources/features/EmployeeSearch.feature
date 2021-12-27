Feature: Employee search

  Scenario Outline: Search actual employee
    Given I log in successfully to the application
    When I select PIM > Employee List menu options
    And fill employee name <employeeName>
    And click Search button
    Then I see <employeeName> in the result list

    Examples:
      | employeeName  |
      | Paul Collings |
