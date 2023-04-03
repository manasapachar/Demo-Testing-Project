Feature: Validating authentic users


Background:
        Given Open the landing page
  
  Scenario: ValidUser
    
    When enter usernamea as "standard_user" in usernamefield
    And enter password as "secret_sauce" in passwordfiled
    And click button
    Then home page should be apper
    
Scenario: InvalidUser ValidPassword
    
   When  enter usernamea as "standard" in usernamefield
    And  enter password as "secret_sauce" in passwordfiled
    And click button
    Then home page should be apper
  
  Scenario: InvalidUser InvalidPassword
    
    When  enter usernamea as "standard" in usernamefield
    And  enter password as "secret" in passwordfiled
    And click button
    Then home page should be apper
    
    
    Scenario: ValidUser InvalidPassword
    
    When  enter usernamea as "standard_user" in usernamefield
    And enter password as "secret" in passwordfiled
    And click button
    Then home page should be apper