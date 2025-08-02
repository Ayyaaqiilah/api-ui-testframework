Feature: Login functionality on Saucedemo

  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters username "standard_user" and password "secret_sauce"
    And clicks login button
    Then user should be redirected to the products page

  Scenario: Failed login with invalid credentials
    Given user is on the login page
    When user enters username "wrong_user" and password "wrong_pass"
    And clicks login button
    Then user should see error message "Epic sadface: Username and password do not match any user in this service"

  Scenario: Failed login with locked_out_user
    Given user is on the login page
    When user enters username "locked_out_user" and password "secret_sauce"
    And clicks login button
    Then user should see error message "Epic sadface: Sorry, this user has been locked out."

  Scenario: Failed login with empty username
    Given user is on the login page
    When user enters username "" and password "secret_sauce"
    And clicks login button
    Then user should see error message "Epic sadface: Username is required"

  Scenario: Failed login with empty password
    Given user is on the login page
    When user enters username "standard_user" and password ""
    And clicks login button
    Then user should see error message "Epic sadface: Password is required"
