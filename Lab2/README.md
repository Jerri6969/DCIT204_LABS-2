Lab 2 – Interactive Array Algorithms

Course: DCIT 204 – Data Structures and Algorithms
Student: Jerri6969 | ID: 22303723

Overview

This lab implements two interactive console programs in Java, both using
Scanner to collect all input directly from the user at runtime (array
size, elements, and target value where applicable).

Files

1. FindMax.java

Finds the maximum value in a user-entered array and reports the index at
which it occurs.


Algorithm: Linear search — track a running maximum while scanning
the array once.
Time Complexity: O(n) — each element is visited exactly once.
Space Complexity: O(n) — for storing the input array.


Sample Run
Sample1

Enter the number of elements in the array: 7
Enter 7 integer values:
Element [0]: 9
Element [1]: 0
Element [2]: 7
Element [3]: 5
Element [4]: 3
Element [5]: 2
Element [6]: 8

--- Find Maximum Results ---
Array: [9, 0, 7, 5, 3, 2, 8]
Maximum Value : 9
Found at Index: 0
-----------------------------

Sample 2
Enter the number of elements in the array: 5
Enter 5 integer values:
Element [0]: 3
Element [1]: 7
Element [2]: 2
Element [3]: 9
Element [4]: 4

--- Find Maximum Results ---
Array: [3, 7, 2, 9, 4]
Maximum Value : 9
Found at Index: 3
-----------------------------

2. PairSum.java

Searches a user-entered array for a unique pair of numbers whose sum
equals a target value, using the brute force (nested loop) method.


Algorithm: Brute force — for every index i, check every later
index j to see if numbers[i] + numbers[j] == target. Stops at the
first match found.
Time Complexity: O(n²) — worst case checks every pair of elements.
Space Complexity: O(n) — for storing the input array.


Sample Run

Sample 1

Enter the number of elements in the array: 5
Enter 5 integer values:
Element [0]: 3
Element [1]: 7
Element [2]: 2
Element [3]: 9
Element [4]: 4
Enter the Target Sum: 11

--- Pair Sum Results ---
Pair Found!
Indices: [1, 4]
Values : 7 and 4
Equation: 7 + 4 = 11
------------------------

Sample 2

Enter the number of elements in the array: 8
Enter 8 integer values:
Element [0]: 7
Element [1]: 55
Element [2]: 89
Element [3]: 54
Element [4]: 22
Element [5]: 12
Element [6]: 34
Element [7]: 89
Enter the Target Sum: 50

--- Pair Sum Results ---
No pair found that sums to 50.
------------------------

(The nested loop checks pairs in order: (0,1), (0,2)... up to (1,4),
where 7 + 4 = 11 is the first match, so that pair is reported.)

How to Compile & Run

javac FindMax.java
java FindMax

javac PairSum.java
java PairSum

Time Complexity Summary

ProgramBest CaseWorst CaseSpaceFindMaxO(n)O(n)O(n)PairSumO(1)*O(n²)O(n)

* Best cases for PairSum occurs if the first two elements checked
immediately sum to the target.