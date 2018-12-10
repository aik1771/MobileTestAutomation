Feature:Ionic App Feature

  Background:
    Given I am on Intro Page

  @swipe_test
  Scenario: Verify user should be able to slide right on tutorial pages
    When I swipe right 3 times on tutorials slides
    Then I verify Continue button is displayed