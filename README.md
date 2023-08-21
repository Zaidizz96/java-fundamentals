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
# lab06

---
## Introduction

In this project, I've implemented a restaurant review system using Java. The system consists of two main classes: `Restaurant` and `Review`. The `Restaurant` class represents individual restaurants, while the `Review` class holds information about user reviews for those restaurants.

## Classes

### Restaurant Class

The `Restaurant` class represents a restaurant and contains the following attributes and methods:

- `name`: The name of the restaurant.
- `rate`: The average rating of the restaurant.
- `price`: The price category of the restaurant.
- `reviewList`: A list of reviews associated with the restaurant.

Methods:

- `addReview(Review review)`: Associates a review with the restaurant and recalculates the average rating.
    - This method checks if the review is not already associated with the restaurant, then adds the review to the `reviewList`.
    - It calculates the new average rating by summing up the stars from all reviews and dividing by the number of reviews.

### Review Class

The `Review` class represents a review and contains the following attributes and methods:

- `author`: The author of the review.
- `body`: The text content of the review.
- `numberOfStars`: The number of stars given in the review.
- `restaurant`: The restaurant that the review is about.

## Usage

To use the restaurant review system, you can create instances of the `Restaurant` and `Review` classes as shown in the example below:

```java
// Creating a restaurant
Restaurant restaurant = new Restaurant("Sample Restaurant", 2.0);

// Creating a review and associating it with the restaurant
Review review = new Review("John Doe", "Great food and service!", 4, restaurant);

// Associating the review with the restaurant
restaurant.addReview(review);
