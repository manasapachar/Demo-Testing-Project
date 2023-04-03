Feature: select Product

Background:
Given Login into application


@functional
@sanity

Scenario: Select with Product name

When click on product with Name as "Sauce Labs Backpack" on product page
Then product page should open 
And add it to cart 
And verify product is added to cart

@sanity
Scenario: Click on Multiple product on the page 
    Then Click on product and come back
    |id| nameofproduct          |details|
    |1| Sauce Labs Backpack     |abc|
    |2| Sauce Labs BBike Light  |def|
    |3| Sauce Labs              |abc|
    |4| Sauce Labs              |def|
    |5| Sauce Labs              |abc|
    |6| Sauce Labs              |def|

    
Scenario: select with image



Scenario: select with product direct visible addtocart