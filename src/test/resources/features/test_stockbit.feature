Feature: Demoqa Book
As a user I should able to buy book on website

  @gita
Scenario: User select input all menu
  Given I navigate to "https://demoqa.com/select-menu"
  When User in "select menu" page
    And User choose select value "Another root option"