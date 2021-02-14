Feature: Login

  @wip
  Scenario Outline: Authorised users can log in as <userType>
    When user enters "<userType>" credentials
    Then user navigates to home page

    Examples:
      | userType |
      | hr        |
      | helpdesk  |
      | marketing |