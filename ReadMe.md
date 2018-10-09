Workday
=======

A simple interview exam for candidates that exercises skills in Maven, Java, JUnit and Git.

Your mission
------------

...should you choose to accept it, is to implement a method to compute the date corresponding to the specified number of workdays (also known as "business days") after a given start date.

For example, if today is March 16th, 2018 and I want to know what date would 2 workdays from now be, the answer would be March 20th:

```
     March 2018
Su Mo Tu We Th Fr Sa
             1  2  3
 4  5  6  7  8  9 10
11 12 13 14 15 16 17
18 19 20 21 22 23 24
25 26 27 28 29 30 31
```

Tasks
-----

We expect to see minimally-viable Git commits, effectively showing us how you work and what paths you took, etc.  Bonus points for test-driven development (TDD).

1. Upgrade the `junit` dependency to version `4.12` and convert the test code to use annotations such as `@Test`.
2. Rename `App` and `AppTest` to `Workday` and `WorkdayTest`.
3. Write tests for and implement the `calculateWorkday` method whose skeleton follows:
    ```
    public static Date calculateWorkday(final Date startDate, final int numberOfWOrkdays) {
        // TODO: test and implement me!
    }
    ```


Deliverables
------------

A ZIP file representing the contents of this folder, including the Git repository with all the commits you have added.
