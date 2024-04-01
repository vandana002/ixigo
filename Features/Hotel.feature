Feature: Hotel Booking in Ixigo Website

Scenario: Hotel Booking in Ixigo Website
Given I am in the homepage
When I click on Hotels
Then It should display the destination

Scenario: Entering destination
Given I am in hotel page
When I click on destination and it should clear the existing destination
Then I enter the required destination "Hyderabad"
Then I should click on search

Scenario: Search for a hotel
Given I am in a showing properties page
When I click on any hotel
Then It should redirect to another page and it should show the reviews

Scenario: Invalid Destination
Given I am in hotel page
When I enter the "#@Ey"
Then I should see Oops! No results were found for this keyword. Please modify your search and try again.

