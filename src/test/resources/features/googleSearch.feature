Feature: User search something on google and verify results

  Background:
    Given user on google page

    @done
    Scenario: Iphone search
      When user search iphone on Google
      Then user verify result has iphone

    @smoke
  Scenario: apple search
    When user search apple
    Then user verify result has apple



      |


