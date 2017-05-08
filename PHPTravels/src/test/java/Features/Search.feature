Feature: SearchFeature
  This feature deals with the search functionality of the application PHPTravels

  @TC_1
  Scenario Outline:Check response searching valid data
    Given Navigate to URL 'http://www.phptravels.net/'
    And Enter a valid location as <location>
    And Enter a valid check in date as <check in date>
    And Enter a valid check out date as <check out date>
    And Select number of adults as <adults>
    And Select number of child as <child>
    When Press Search button
    Then Select star grade as <star grade>
    And Select price range as <price range>
    When Press Search blue button
    Then reload page

    Examples:
      |location              |check in date|check out date|adults|child|star grade|price range |
      |Barranquilla,Colombia |05/10/2017   |05/11/2017    |1     |0    |2         |25:1525     |
      |Amsterdam, Netherlands|05/11/2017   |05/17/2017    |2     |0    |1         |25:25       |
      |Riviera Maya, Mexico  |05/19/2017   |05/21/2017    |3     |0    |3         |225:925     |
      |Florida, Colombia     |05/12/2017   |05/26/2017    |4     |0    |4         |625:1025    |
      |Havana, Cuba          |05/23/2017   |05/29/2017    |5     |0    |5         |1325:1725   |

    #-------------------------------------------------------------------------------------------------------------------

  @TC_2
  Scenario Outline:Check response searching with empty location
    Given Navigate to URL 'http://www.phptravels.net/'
    And skip the location field
    And Enter a valid check in date as <check in date>
    And Enter a valid check out date as <check out date>
    And Select number of adults as <adults>
    And Select number of child as <child>
    When Press Search button
    Then show warning message

    Examples:
      |check in date|check out date|adults|child|
      |05/11/2017   |05/12/2017    |1     |0    |
      |05/14/2017   |05/16/2017    |1     |0    |
      |05/16/2017   |05/19/2017    |1     |0    |
      |05/19/2017   |05/21/2017    |1     |0    |
      |05/22/2017   |05/25/2017    |1     |0    |
    #-------------------------------------------------------------------------------------------------------------------

  @TC_3
  Scenario Outline:Check response searching with no filters.
    Given Navigate to URL 'http://www.phptravels.net/'
    And Enter a valid location as <location>
    And Enter a valid check in date as <check in date>
    And Enter a valid check out date as <check out date>
    And Select number of adults as <adults>
    And Select number of child as <child>
    And Press Search button
    When Press Search blue button
    Then reload page

    Examples:
      |location            |check in date|check out date|adults|child|
      |Bogor, Indonesia    |05/11/2017   |05/12/2017    |1     |0    |
      |Lima, Peru          |05/14/2017   |05/16/2017    |1     |0    |
      |Guatemala, Guatemala|05/16/2017   |05/19/2017    |1     |0    |
      |Montevideo, Uruguay |05/19/2017   |05/21/2017    |1     |0    |
      |Venice, Italy       |05/22/2017   |05/25/2017    |1     |0    |
    #-------------------------------------------------------------------------------------------------------------------

  @TC_4
  Scenario Outline:Check response selecting a age child
    Given Navigate to URL 'http://www.phptravels.net/'
    And Enter a valid location as <location>
    And Enter a valid check in date as <check in date>
    And Enter a valid check out date as <check out date>
    And Select number of adults as <adults>
    And Select number of child as <child>
    And select age of child as <age of child>
    And press Done button
    When Press Search button
    Then Select star grade as <star grade>
    And Select price range as <price range>
    When Press Search blue button
    Then reload page

    Examples:
      |location              |check in date|check out date|adults|child|age of child|star grade|price range |
      |Barranquilla,Colombia |05/10/2017   |05/11/2017    |1     |2    |Under 1,3   |2         |25:1525     |
      |Amsterdam, Netherlands|05/11/2017   |05/17/2017    |2     |2    |6,7         |2         |25:25       |
      |Riviera Maya, Mexico  |05/19/2017   |05/21/2017    |3     |3    |10,11,12    |3         |225:925     |
      |Florida, Colombia     |05/12/2017   |05/26/2017    |4     |2    |12,13       |4         |625:1025    |
      |Havana, Cuba          |05/23/2017   |05/29/2017    |5     |2    |14,4        |5         |1325:1725   |
    #-------------------------------------------------------------------------------------------------------------------

  @TC_5
  Scenario Outline:Checking the response when the location is wrong
    Given Navigate to URL 'http://www.phptravels.net/'
    And Enter a invalid location as <location>
    And Enter a valid check in date as <check in date>
    And Enter a valid check out date as <check out date>
    And Select number of adults as <adults>
    And Select number of child as <child>
    And select age of child as <age of child>
    And press Done button
    When Press Search button
    Then Select star grade as <star grade>
    And Select price range as <price range>
    When Press Search blue button
    Then reload page

    Examples:
      |location|check in date|check out date|adults|child|age of child|star grade|price range |
      |AABBCC  |05/10/2017   |05/11/2017    |1     |1    |Under 1     |2         |25:1525     |
      |TESTPLAN|05/11/2017   |05/17/2017    |2     |1    |6           |2         |25:25       |
      |TESTRANE|05/19/2017   |05/21/2017    |3     |1    |10          |3         |225:925     |
      |TRAVEL01|05/12/2017   |05/26/2017    |4     |1    |12          |4         |625:1025    |
      |!!      |05/23/2017   |05/29/2017    |5     |1    |14          |5         |1325:1725   |