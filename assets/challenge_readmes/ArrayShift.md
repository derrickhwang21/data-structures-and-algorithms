# ArrayShift - Shift an Array
CodeFellows - 401 - Java
Challenge 02: Data & Algorithm Challenge
## Challenge
Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to java, return an array with the new value added at the middle index.

## Approach & Efficiency
By beginning finding out the length of the input array, we first, create a new instance of the input array in our `insertShiftArray` method.

To find the midpoint index of our new instance of the array, we first use a conditional ternary statement to figure out whether we have back a odd or even length array, to return the proper midpoint for our new instance of the array.

Using a for loop we input our parameter value if `i = midPointIndex` according to our original array, or else, calculated midpoint, or else, original array one less index.

Our method has a

Space efficiency of O(2^n)
Time efficiency of O(n)

## Solution
<!-- Embedded whiteboard image -->
![array_shift white board](../array_shift.jpg)