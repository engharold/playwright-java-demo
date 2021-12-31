Feature: Employee search

  Scenario Outline: Search actual employee
    Given I log in successfully to the application
    When I click on "PIM" menu option
    And click on "Employee List" submenu option
    And input <employeeName> in Employee Name search field
    And click Search button
    Then I see <employeeName> in the result list

    Examples:
      | employeeName  |
      | Nathan Elliot |
