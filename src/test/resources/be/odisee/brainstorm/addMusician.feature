Feature: Add Person

It should be possible to add a musician to the list
Just after adding the musician, the details of the musician should be known
After the list is shown again, the musician first name and last name should be visible

Scenario: Add one musician
Given I am on the page where I can introduce a new person
When I enter "Sanne" in the voornaam field
And I enter "Putzeys" in the familienaam field
And I enter "selah@sue.be" in the emailadres field
And I enter "raggamuffin" in the paswoord field
And I press on the Submit button
Then I should see the following on the screen
| label        | data         |
| Voornaam:    | Sanne        |
| Familienaam: | Putzeys      |
| E-mailadres: | selah@sue.be |
| Paswoord:    | raggamuffin  |
When I click the Lijst van alle personen Link
Then I should see a list containing "Sanne Putzeys"
And I close the browser