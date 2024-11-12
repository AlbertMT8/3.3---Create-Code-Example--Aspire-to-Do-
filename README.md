# ReplaceAll Example in Java

This project demonstrates the use of the `replaceAll` method with an `ArrayList` in Java. The program creates a list of integers, squares each element using a `UnaryOperator`, and then displays both the original and modified lists.

## Project Overview

The `replace` class showcases how to use the `replaceAll` method in an `ArrayList` to apply a transformation to each element in the list. In this example, each integer in the list is squared using a `UnaryOperator`.

### Key Features

- **ArrayList Manipulation**: Demonstrates adding elements to an `ArrayList` and modifying them in-place.
- **UnaryOperator for Transformation**: Uses a `UnaryOperator` functional interface to square each element in the list.
- **replaceAll Method**: The `replaceAll` method applies the `UnaryOperator` to every element in the list, transforming it accordingly.

## Code Structure

### Class: `replace`

The `replace` class contains a single `main` method that performs the following actions:

1. **Create an ArrayList**: Initializes a list of integers.
2. **Display Original List**: Prints the original list of integers.
3. **Define a UnaryOperator**: Creates a `UnaryOperator` that squares each integer in the list.
4. **Apply replaceAll**: Uses the `replaceAll` method to apply the `UnaryOperator` to each element in the list.
5. **Display Modified List**: Prints the modified list with squared values.

### Code Example

Here is the core logic of the `replace` class that defines the `UnaryOperator` and applies `replaceAll`:

```java
// Define a UnaryOperator to square each number
UnaryOperator<Integer> square = n -> n * n;

// Use replaceAll to square each number in the list
numbers.replaceAll(square);
