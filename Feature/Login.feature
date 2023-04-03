


Feature: Validating the authentic user


Background:
        Given landing page is open

  Scenario: Valid User
    
    When entered usernamea as "standard_user" in usernamefield
    And entered password as "secret_sauce"  in passwordfiled
    And click on button
    Then home page should apper
    
Scenario: Invalid User Valid Password
    
   When entered usernamea as "standard" in usernamefield
    And entered password as "secret_sauce"  in passwordfiled
    And click on button
    Then home page should apper
  
  Scenario: Invalid User Invalid Password
    
    When entered usernamea as "standard" in usernamefield
    And entered password as "secret"  in passwordfiled
    And click on button
    Then home page should apper
    
    
    Scenario: Valid User Invalid Password
    
  When entered usernamea as "standard_user" in usernamefield
    And entered password as "secret"  in passwordfiled
    And click on button
    Then home page should apper