Feature: Login in to omayo application



@All @Login 
Scenario Outline: User login into omayo application with valid credentials
Given I login into omayo website
When I entered valid "<someusername>" and valid "<somepassword>" credentials
And I clicked on login button
Then user should be able to login with "<someexpected>" results
Examples:
|someusername      |somepassword|someexpected|
|arun          |12345   |failure|

