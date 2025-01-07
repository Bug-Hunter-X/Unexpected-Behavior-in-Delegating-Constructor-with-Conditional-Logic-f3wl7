# Scala Bug: Unexpected Behavior in Delegating Constructor with Conditional Logic

This repository demonstrates a subtle bug that can occur in Scala when using delegating constructors in conjunction with conditional logic within methods.

## Bug Description
The `MyClass` class uses a delegating constructor to initialize `value` to 0 if no argument is provided. The `myMethod` function then applies different logic based on the value of `value`. While this logic works correctly for explicitly initialized objects, it might lead to unexpected behavior when using the default constructor.

## How to Reproduce
1. Clone this repository.
2. Compile and run `Main.scala`.
3. Observe the output, paying close attention to the result when the default constructor is used.

## Solution
The solution involves carefully considering the implications of delegating constructors. In this specific case, ensuring the default constructor assigns a value that consistently produces the desired behavior is crucial.
