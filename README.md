# java-fundamentals

The code contains several functions that perform various operations on arrays of integers.
---
# lab_01
---
## Pluralize Function

File: `PluralizeFunction.java`

This file contains a function named `pluralize` that takes a word and a number as inputs and returns the pluralized form of the word if the number is greater than one.

## Flipping Coins Function

File: `FlippingCoinsFunction.java`

This file implements a function called `flipNHeads` which simulates flipping coins until a specified number of heads are flipped in a row.

## Command Line Clock Function

File: `CommandLineClockFunction.java`

This file includes a function named `clock` that prints the current time to the console, updating every second. The program continues until manually stopped.

---
# lab02
---

## `roll` Function

```java
int[] num = roll(7);
for (int rolls : num) {
    System.out.println(rolls);
}
```
The `roll` function generates an array of random integers with a specified length. In the example above, it generates an array of 7 random integers and prints each value.

## `containsDuplicates` Function

```java
int[] testArr = {1, 4, 5, 4, 2};
System.out.println(containsDuplicates(testArr));
```
The `containsDuplicates` function checks if an array contains any duplicate values. It returns `true` if there are duplicates, and `false` otherwise. In the example above, it checks the `testArr` array for duplicates and prints the result.

## `calculatingAverages` Function

```java
int[] testAvg = {4, 7, 2, 7};
System.out.println(calculatingAverages(testAvg));
```
The `calculatingAverages` function calculates the average value of an array of integers. It returns the calculated average. In the example above, it calculates the average of the `testAvg` array and prints the result.

## `findLowestAverageIndex` Function

```java
int[][] weeklyMonthTemperatures = {
    {66, 64, 58, 65, 71, 57, 60},
    {57, 65, 65, 70, 72, 65, 51},
    {55, 54, 60, 53, 59, 57, 61},
    {65, 56, 55, 52, 55, 62, 57}
};
int lowestIndex = findLowestAverageIndex(weeklyMonthTemperatures);
int[] lowestAverageArray = weeklyMonthTemperatures[lowestIndex];

System.out.println("Array with the lowest average temperature:");
for (int temperature : lowestAverageArray) {
    System.out.print(temperature + " ");
}
```
The `findLowestAverageIndex` function calculates the average temperature for each sub-array in the `weeklyMonthTemperatures` array and returns the index of the sub-array with the lowest average. The code then prints the elements of the sub-array with the lowest average temperature.

---

This code provides examples of various array manipulation operations, including generating random numbers, checking for duplicates, calculating averages, and finding the sub-array with the lowest average. It can serve as a starting point for further exploration and development of similar functionalities in Java applications.