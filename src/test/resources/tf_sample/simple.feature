Feature: Are 1 and 1 2?
  feature for testing TF Framework

  @TFSample
  Scenario Outline: add two numbers
    Given first member is <int1>
    Given second member is <int2>
    And give them 3
    Then sum should be <result>
    Examples:
      | int1        | int2 | result      |
      | 196.5448888| 1    | 197.5448888 |
