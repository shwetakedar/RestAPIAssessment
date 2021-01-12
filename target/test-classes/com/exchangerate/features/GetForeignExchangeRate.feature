#Author: mmeshweta@gmail.com
#Keywords Summary : Verify the API's related to Foreign Exchange Rate

Feature: Rate Foreign Exchange API

@StatusCodeValidation @LatestRate
Scenario Outline: To verify the status code is displayed as <statusCode> for latest Foreign Exchange Rates API
Given Rates API for latest Foreign Exhchange rates
#When user calls <latest Foreign Exchange Rates API> with GET http request
When user calls latest Foreign Exchange Rates API <resource> with GET http request
Then the API call is displayed with status code <statusCode>

Examples:
| statusCode | resource     |
|   200      | 'latest'     |
|   400      | ' '          |
|   200      | '2010-01-12' |
|   404      | '/'          |

@ValidResponse @LatestRate
Scenario Outline: To verify that the valid response is received

Given Rates API for latest Foreign Exhchange rates
When user calls latest Foreign Exchange Rates API <resource> with GET http request
Then the API call is displayed with status code <statusCode>
And "base" in response body is <currency>
And "date" in response body is <date>
And "rate" is displayed

Examples:
| statusCode | resource   | currency |     date     |
|   200      | 'latest'   | 'EUR'    | '2021-01-11' |
|   200      |'2010-01-12'| 'EUR'    | '2010-01-12' |

