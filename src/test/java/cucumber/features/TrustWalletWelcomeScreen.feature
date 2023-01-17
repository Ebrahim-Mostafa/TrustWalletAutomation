
Feature: Trust Wallet Application Load Main Components
  As a Trust Wallet application user I should see some components when the session start
  Scenario : Launch Trust Wallet Application
    Given Trust wallet app is closed
    When User is launching trust wallet app
    Then Trust wallet App Logo Should be displayed
    And Private and secure title is displayed
    And Private and secure message is displayed
    When Create new wallet button is displayed
    And Already have a wallet button is displayed
    And Already have a wallet button is enabled
    Then Click on already have a wallet button
