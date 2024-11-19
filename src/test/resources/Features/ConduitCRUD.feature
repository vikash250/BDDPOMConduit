Feature: Conduit CRUD Funtions

Scenario: Login into App
Given User is on Login page
When User provide "vikashmodi.88@gmail.com" and "Password"
Then User should be on Home Page

Scenario: Create new Article
Given User should be on New Article Page
When User enters Article details
|title|Desc|Content|tag|

|Testtitle6|TestDesc6|TestContent6|Testtag6|

Then Article must be created


Scenario: View Article
Given User should be on Global Feed page
When User select an article "Testtitle6"
Then Article detail page must be displayed

Scenario: Update an Article
Given Article detail page must be displayed
When User update article detail
Then Article detail must be updated 

Scenario: Delete an Article
Given Article detail page must be displayed
When User delete article
Then Article must be deleted