Feature: Book Search and Collection

  Background:
    Given I am logged in as "username"

  Scenario: Search for a book and add it to the collection
    When I search for a book with title "The Art of Testing"
    Then I should see the book added to my collection

  Scenario: Search for a non-existent book
    When I search for a book with title "Non-Existent Book"
    Then I should see an error message

  Scenario: Delete a book from the collection
    When I delete the book from my collection
    Then I should see no books in my collection
