@web
@contact

Feature: contact

  @positive
  Scenario: User contact with valid data
    Given user is on home page
    When user click contact menu
    And user input contact email "abc@gmail.com"
    And user input contact name "vando"
    And user input message "Hello"
    And user click the send message button
    Then user should see contact alert with "Thanks for the message!!"

  # Pasti gagal
  @negative
  Scenario: User contact without input data
    Given user is on home page
    When user click contact menu
    And user click the send message button
    Then user should see contact alert with "Please fill out Email,Name dan Message."

  # Pasti gagal
  @negative
  Scenario: User contact with missing email
    Given user is on home page
    When user click contact menu
    And user input contact name "vando"
    And user input message "Hello"
    And user click the send message button
    Then user should see contact alert with "Please fill out Email,Name dan Message."

  # Pasti gagal
  @negative
  Scenario: User contact with missing name
    Given user is on home page
    When user click contact menu
    And user input contact email "abc@gmail.com"
    And user input message "Hello"
    And user click the send message button
    Then user should see contact alert with "Please fill out Email,Name dan Message."

  # Pasti gagal
  @negative
  Scenario: User contact with missing message
    Given user is on home page
    When user click contact menu
    And user input contact email "abc@gmail.com"
    And user input message "Hello"
    And user click the send message button
    Then user should see contact alert with "Please fill out Email,Name dan Message."

  @cancel
  Scenario: User cancels contact
    Given user is on home page
    When user click contact menu
    And user click cancel contact button
    Then contact modal should be closed