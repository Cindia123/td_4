Feature: Roman numerals conversion
  As a user
  I want to convert an integer into its Roman numeral
  So that I can write numbers the Roman way

  Scenario: Convert 1 to I
    Given the number 1
    When I convert it to a Roman numeral
    Then the result should be "I"

  Scenario: Convert 2 to II
    Given the number 2
    When I convert it to a Roman numeral
    Then the result should be "II"

  Scenario: Convert 3 to III
    Given the number 3
    When I convert it to a Roman numeral
    Then the result should be "III"

  Scenario: Convert 4 to IV
    Given the number 4
    When I convert it to a Roman numeral
    Then the result should be "IV"

  Scenario: Convert 5 to V
    Given the number 5
    When I convert it to a Roman numeral
    Then the result should be "V"

  Scenario: Convert 9 to IX
    Given the number 9
    When I convert it to a Roman numeral
    Then the result should be "IX"

  Scenario: Convert 10 to X
    Given the number 10
    When I convert it to a Roman numeral
    Then the result should be "X"

  Scenario Outline: Convert <number> to <roman>
    Given the number <number>
    When I convert it to a Roman numeral
    Then the result should be "<roman>"

    Examples: Units and teens
      | number | roman  |
      | 6      | VI     |
      | 7      | VII    |
      | 8      | VIII   |
      | 11     | XI     |
      | 12     | XII    |
      | 13     | XIII   |
      | 14     | XIV    |
      | 15     | XV     |
      | 16     | XVI    |
      | 17     | XVII   |
      | 18     | XVIII  |
      | 19     | XIX    |
      | 20     | XX     |

    Examples: Tens
      | number | roman  |
      | 30     | XXX    |
      | 40     | XL     |
      | 49     | XLIX   |
      | 50     | L      |
      | 60     | LX     |
      | 90     | XC     |
      | 99     | XCIX   |

    Examples: Hundreds
      | number | roman    |
      | 100    | C        |
      | 101    | CI       |
      | 144    | CXLIV    |
      | 200    | CC       |
      | 300    | CCC      |
      | 400    | CD       |
      | 444    | CDXLIV   |
      | 500    | D        |
      | 600    | DC       |
      | 900    | CM       |
      | 999    | CMXCIX   |

    Examples: Thousand
      | number | roman  |
      | 1000   | M      |