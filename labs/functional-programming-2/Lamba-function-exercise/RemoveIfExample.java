import java.util.ArrayList;
import java.util.List;

public class RemoveIfExample {
    public static void main(String[] args) {
        //1.6 Remove Even Numbers Using Lambda
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        numbers.removeIf(number -> number % 2 == 0);
        numbers.forEach(System.out::println);


    }

}
