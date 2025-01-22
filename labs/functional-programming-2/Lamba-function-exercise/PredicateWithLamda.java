import java.util.List;
import java.util.function.Predicate;

public class PredicateWithLamda {
//    1.3.2 Predicate Example with Lambda
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> numGreaterThanFive = number -> number > 5;
        numbers.stream().filter(numGreaterThanFive).forEach(System.out::println);



    }
}
