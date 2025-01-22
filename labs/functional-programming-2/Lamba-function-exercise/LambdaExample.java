import java.util.ArrayList;
import java.util.List;
           //1.1 Simple lamda example
public class LambdaExample {
    public static void main(String[] args) {
        // create the list
        List<String> list = new ArrayList<>();
        //add elements
        list.add("Cookies");
        list.add("Chocolates");
        list.add("Soft drink");
        // use lambda function to display the list
        list.forEach(System.out::println);







    }
}