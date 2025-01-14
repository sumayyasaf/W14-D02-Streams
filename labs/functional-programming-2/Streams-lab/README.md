# Java Streams Lab with Student Class

## Objective:
In this lab, you will work with **Streams** in Java using a `Student` class. The tasks will involve:
- Stream creation from collections and arrays of `Student` objects
- Intermediate and terminal stream operations on `Student` objects
- Working with primitive streams for numeric attributes (e.g., age)
- Using various stream operations like `map()`, `filter()`, `collect()`, etc.

### Task 1: Define the `Student` Class
Create a class named `Student` with the following attributes:
- `String name`
- `int age`
- `double grade`

The constructor should initialize these attributes, and provide appropriate getter methods. 

```java
public class Student {
    private String name;
    private int age;
    private double grade;

    // Add constructor, getters, and setters here
}
```

### Task 2: Create a List of Students
Create a `List<Student>` containing a few `Student` objects (at least 5 students). For example:

```java
List<Student> students = Arrays.asList(
    new Student("Alice", 20, 88.5),
    new Student("Bob", 22, 75.0),
    new Student("Charlie", 23, 92.0),
    new Student("David", 21, 84.0),
    new Student("Eve", 22, 90.5)
);
```

### Task 3: Stream Operations on Students

#### 3.1. Create a stream from the `students` list.
Use the `.stream()` method to create a stream from the `students` list. Then, print each student's name using `forEach()`.

#### 3.2. Map student names to uppercase.
Use the `map()` operation to transform the student's names to uppercase.

#### 3.3. Filter students by age.
Use the `filter()` method to find students who are 22 years old or older. Print their names.

#### 3.4. Sort students by grade.
Use the `sorted()` method to sort students by their grades in ascending order.

#### 3.5. Remove duplicate students based on name.
Use the `distinct()` method to remove duplicate students based on their names.

#### 3.6. Count the number of students older than 21.
Use the `filter()` and `count()` operations to count the number of students who are older than 21.

### Task 4: Collect Data into a List

#### 4.1. Collect student names into a list.
Use the `collect()` method to collect the names of students who have a grade above 80 into a new list of `String`.

### Task 5: Primitive Streams (Working with Numeric Data)

#### 5.1. Create an `IntStream` of student ages and calculate the average age.
Use `mapToInt()` to create an `IntStream` of student ages. Then calculate the average age of students using the `average()` method.

#### 5.2. Create a stream of student grades and calculate the sum.
Use `mapToDouble()` to create a `DoubleStream` of student grades. Calculate the sum of all students' grades using the `sum()` method.

### Task 6: Parallel Streams

#### 6.1. Use a parallel stream to calculate the sum of student grades.
Create a parallel stream from the list of students and use `mapToDouble()` to calculate the sum of their grades. Use the `sum()` method and print the result.

#### 6.2. Compare the performance of a sequential vs parallel stream.
Use a large list of `Student` objects (1000+) and compare the performance of a sequential stream vs. parallel stream for calculating the sum of grades using `mapToDouble()`.

---
