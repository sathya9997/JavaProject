Feature: verifying adactin hotel app details

  Scenario Outline: verifying adactin hotel app login details with valid credentials
    Given user is on adactin page
    When user enters"<username>" , "<password>" and click login button
    And user enters into booking page "<location>","<hotels>","<roomtype>" ,"<number of rooms>"and click search button
    When user enters into hotel page to select the hotel
    And user enter into booking hotel page "<first name>","<last name>","<billing address>","<credit card no>","<credit card type>","<expiry month>","<expiry year>"and "<ccv no>"
    Then user should verify the order id

    Examples: 
      | username    |  | password    |  | location  |  | hotels         |  | roomtype |  | number of rooms |  | first name |  | last name |  | billing address |  | credit card no   |  | credit card type |  | expiry month |  | expiry year |  | ccv no |
      | neelakandan |  | neelakandan |  | Sydney    |  | Hotel Sunshine |  | Double   |  | 1 - One         |  | sathya     |  | bharathi  |  | omr chennai     |  | 1188170000111111 |  | VISA             |  | May          |  |        2023 |  |    123 |
      