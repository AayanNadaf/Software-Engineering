# Experiment 03 – Testing and Validation Techniques

## Aim
To study, perform, and compare different software testing and validation techniques using a Calculator application.

## Objectives
- Understand software testing and validation.
- Differentiate between verification and validation.
- Apply various testing techniques (Black Box, White Box, Grey Box).
- Perform Unit, Integration, System, and Acceptance testing.
- Compare validation techniques.

## Code
- Calculator.java → core logic
- CalculatorDemo.java → demo run
- CalculatorTest.java → JUnit tests
- CalculatorIntegration.java → integration/system testing

## Black Box Test Cases
| Test Case | Input | Expected Output | Actual Output | Result |
|-----------|-------|-----------------|---------------|--------|
| TC01      | 10+5  | 15              | 15            | Pass   |
| TC02      | 10-5  | 5               | 5             | Pass   |
| TC03      | 10*5  | 50              | 50            | Pass   |
| TC04      | 10/5  | 2               | 2             | Pass   |
| TC05      | 10/0  | Exception       | Exception     | Pass   |

## Boundary Value Analysis
- Input: (0,0) → Output: 0 → Pass
- Input: (Integer.MAX_VALUE, 1) → Overflow behavior → Pass
- Input: (-10,-5) → Output: -5 → Pass
- Input: (10,0) → Exception → Pass

## White Box Testing
- Normal execution path tested (10,5).
- Exception branch tested (10,0).
- Achieved 100% statement coverage.

## Integration Testing
| Module        | Status |
|---------------|--------|
| UI → Logic    | Pass   |
| Logic → Output| Pass   |
| UI → Output   | Pass   |

## System Testing
Scenarios tested:
- Multiple operations → Pass
- Invalid input → Pass
- Zero division → Pass
- Negative values → Pass
- Large values → Pass

## Acceptance Testing
Criteria:
- Correct calculations → ✅
- User-friendly interface → ✅
- Fast response → ✅
- Error handling → ✅  
  **Result: Accepted**

## Result
Successfully implemented and compared Black Box, White Box, Grey Box, Unit, Integration, System, and Acceptance testing techniques. Verified correctness and documented strengths/limitations.
