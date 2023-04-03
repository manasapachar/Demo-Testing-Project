

Feature: The registration to accept input

  
  Scenario Outline: User Registered succesfully
    Given user Login of registered
    And accept the value <user> and <Pass> fill the values 
    Then I verify the registered

    Examples: 
    
      | user  | pass | 
      | mmm|     av| 
      | mmm|     ab|
      | mmm|     dd|
      | mmm|     dg|
      | mmm|     dg|
      | mmm|     dg|