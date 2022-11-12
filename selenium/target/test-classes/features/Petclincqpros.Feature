Feature: Add new owner with adding new pet
  As a user, I want to add new owner having a pet

  Scenario: Check all the information added for the newly created owner and pet is correct
    Given I navigate to Pet Clinic
    When I navigate to find owners page
    And I add new owner
    And I add new pet to the new owner
    Then I verify all the information add is correct
