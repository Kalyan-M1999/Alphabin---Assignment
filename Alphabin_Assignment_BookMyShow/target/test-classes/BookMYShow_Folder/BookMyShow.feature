Feature: BookMyShow Ticket Booking

  Scenario: Book A Ticket In BookMyShow
    Given I am on the BookMyShow homepage
    When I search for the city
    And I search for the movie
    Then the booking should be successful
