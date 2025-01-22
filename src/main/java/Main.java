import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Studenttwo> students = new ArrayList<>(Arrays.asList(
                new Studenttwo("Alice", 20, 88.5),
                new Studenttwo("Bob", 22, 75.0),
                new Studenttwo("Charlie", 23, 92.0),
                new Studenttwo("David", 21, 84.0),
                new Studenttwo("Eve", 22, 90.5)
        ));

        students.stream().forEach(student -> System.out.println(student));
        //3.2. Map student names to uppercase.
        students.stream().map(student -> student.getName().toUpperCase())
                .forEach(System.out::println);
        //3.3. Filter students by age.
        students.stream()
                .filter(student -> student.getAge() >= 22 )
                .forEach(student ->System.out.println(student.getName()));
        //3.4. Sort students by grade.
        students.stream()
                .sorted(Comparator.comparingDouble(Studenttwo::getGrade))
                .forEach(student -> System.out.println(student.getName() + ":" + student.getGrade()));
        //3.5. Remove duplicate students based on name.
        students.stream()
                .map(Studenttwo::getName)
                .distinct()
                .forEach(System.out::println);
        //3.6. Count the number of students older than 21.
        students.stream()
                .filter(student ->student.getAge()>=21)
                .count();
        //Task 4: Collect Data into a List
        List<String> highGradeStudents =  students.stream()
                .filter(student -> student.getGrade()>80)
                .map(Studenttwo::getName)
                .collect(Collectors.toList());
        System.out.println("Students with grade above 80: " + highGradeStudents);
        //Task 5: Primitive Streams (Working with Numeric Data)
        double averageAge = students.stream()
                .mapToInt(Studenttwo::getAge)
                .average()
                .orElse(0);
        System.out.println("Average age: " + averageAge);
        //5.2. Create a stream of student grades and calculate the sum.
        double totalGrade = students.stream()
                .mapToDouble(Studenttwo ::getGrade)
                .sum();
        System.out.println("Total grade sum: " + totalGrade);
        //6.1. Use a parallel stream to calculate the sum of student grades.
        List<Studenttwo> largeList = new ArrayList<>();
        for(int i = 0; i<1000; i++){
            largeList.add(new Studenttwo("Student" + i,20 + (i%5), 70 + (i % 30)));
            long startTime = System.nanoTime();
            double sequentialSum = largeList.stream()
                    .mapToDouble(Studenttwo::getGrade)
                    .sum();
            long endTime = System.nanoTime();
            System.out.println("Sequential stream sum: " + sequentialSum);
            System.out.println("Sequential stream time: " + (endTime - startTime) + " nanoseconds");

            startTime = System.nanoTime();
            double parallelSumLarge = largeList.parallelStream()
                    .mapToDouble(Studenttwo::getGrade)
                    .sum();
            endTime = System.nanoTime();
            System.out.println("Parallel stream sum: " + parallelSumLarge);
            System.out.println("Parallel stream time: " + (endTime - startTime) + " nanoseconds");
        }
    }




}