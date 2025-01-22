import java.util.List;
import java.util.function.Predicate;
//1.3.1 Write a java predicate example and print the numbers greater than 5 without using lambda.

class BiggerThanFive<E> implements Predicate<Integer> {

    @Override
    public boolean test(Integer v) {
        return v > 5;
    }

}

public class PredicateWithoutLambdaExample {

    public static void main(String[] args) {
        //Create the list having random integer variables.

        List<Integer> randomNum = List.of(2, 5, 6, 7, 3, 9, 10);
        //create object of above class
        Predicate<Integer> isGreaterThanFive = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 5;
            }
        };
        randomNum.stream().filter(isGreaterThanFive).forEach(System.out::println);





    }
}