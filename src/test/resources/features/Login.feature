Feature: Login


  Scenario Outline: Authorised users can log in as <userType>
    When the user logs in as "<userType>"
    Then user navigates to home page

    Examples:
      | userType |
      | hr        |
      | helpdesk  |
      | marketing |