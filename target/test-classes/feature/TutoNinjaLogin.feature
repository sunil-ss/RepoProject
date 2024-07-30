Feature: Login into tuto ninja application

@Tuto
Scenario: Login into Tuto Ninja with valid cred
Given I navigate to the Toto applicaion
When I enetered valid cred "saisunilk.1598@gmail.com" and "143143" into the fields
And I clicked onto login button
Then user should be able to login sucessfully