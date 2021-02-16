@wip
Feature: Drive Functions

  Scenario Outline: Authorised "<user>" user can display "<drive>"
    Given the user logs in as "<user>"
    And the user navigates to "Drive" page
    When the user clicks "<drive>"
    Then the user can display "<drive>" window

    Examples:
      | user      |  | drive         |
      | hr        |  | my drive      |
      | hr        |  | company drive |
      | helpdesk  |  | my drive      |
      | helpdesk  |  | company drive |
      | marketing |  | my drive      |
      | marketing |  | company drive |
