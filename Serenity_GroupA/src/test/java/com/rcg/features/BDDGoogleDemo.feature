Feature: Google - Click Images


  Scenario: Successful redirection to Google Images
    Given Browser and website "<website>" is open 
    When User clicked Images
    Then Redirection Successful
    



    Examples: 
   |            website             | 
   |   https://www.google.com/      |