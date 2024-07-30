Feature: Searching of various prdocut categories should be possible along with product search

It is a good to prodvide an option to end user tp know about the feature file program

@Books
Scenario: User should be able to search for the products under books category
Given I visit the website as a guest user
When I select the books option from the search dropdown
And I click on the search icon option
Then I should see the page having Amazon Best Reads is getting displayed
But I should not see the other category products

@All @Baby
Scenario: User should be able to search for the products under baby category
Given I visit the website as a guest user
When I select the baby option from the search dropdown
And I click on the search icon option
Then I should see the page having Offer on baby products is getting displayed
But I should not see the other category products