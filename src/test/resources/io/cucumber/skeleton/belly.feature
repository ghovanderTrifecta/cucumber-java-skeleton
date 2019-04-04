Feature: Belly

  @smoke
  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  @smoke
  Scenario: a few more cukes
    Given I have 60 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  @smoke
  Scenario: a lot of cukes
    Given I have 80 cukes in my belly
    When I wait 1 hour
    Then my belly should growl
