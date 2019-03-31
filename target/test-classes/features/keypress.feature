Feature: KeyPress automation practice

  @KeyPress
  Scenario Outline: Assert text and colour displayed
    Given I am at Herokaupp / Key Presses Page
    When I send a "<key>" key
    Then I can assert the "<key>" sent and the colour is green
    Examples:
      | key |
      | A   |
      | B   |
      | C   |
      | D   |