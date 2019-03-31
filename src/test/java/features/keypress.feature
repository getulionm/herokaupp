Feature: Herokaupp automation practice

  @KeyPress
  Scenario Outline: Assert text and colour displayed
    Given I am at Herokaupp
    When I click on key presses
    And I send a "<key>" key
    Then I can assert the "<key>" sent and the colour is green
    Examples:
      | key |
      | A   |
      | B   |
      | C   |
      | D   |