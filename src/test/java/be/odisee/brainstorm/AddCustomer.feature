Feature: Add Customer

  It should be possible to add a customer to the list
  Just after adding the customer, the details of the customer should be known
  After the list is shown again, the musician first name and last name should be visible

  Scenario: Add one customer
    Given I am on the page where I can introduce a new customer
    When I enter "Sanne" in the voornaam field
    And I enter "Putzeys" in the familienaam field
    And I enter "SanPut" in the gebruikersnaam field
    And I enter "selah@sue.be" in the emailadres field
    And I enter "raggamuffin" in the paswoord field
    And I press on the Save button
    Then I should see the following on the screen
      | label           | data         |
      | Voornaam:       | Sanne        |
      | Familienaam:    | Putzeys      |
      | Gebruikersnaam: | raggamuffin      |
      | E-mailadres:    | selah@sue.be |
      | Paswoord:       | SanPut  |
    When I click the Lijst van alle klanten Link
    Then I should see a list containing "Sanne Putzeys"
    And I close the browser