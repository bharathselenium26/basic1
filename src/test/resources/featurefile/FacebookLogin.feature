Feature: Login to facebook
Keywords Summary : This test will verify login related scenarios to FACAEBOOK.COM



Scenario: Create an account
Given User navigated to FACEBOOK.COM
When user enter FirstName as "bharath" and LastName as "bharath123"
And user click on signup button
Then acount should not be created



