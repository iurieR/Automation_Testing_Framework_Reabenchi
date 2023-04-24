@run
Feature: Register feature test suite

  Background:
    Given "https://demo.opencart.com/" is accessed

  @run
  Scenario: Register Page URL is accessibel from Home Page
    When my account botton is clicked
    And register button is clicked
    Then "register" is present within the current URL

  Scenario Outline: Register page URL contains the following word <keyword>
    When my account botton is clicked
    And register button is clicked
    Then "<keyword>" is present within the current URL
    Examples:
      | keyword          |
      | index            |
      | account/register |



