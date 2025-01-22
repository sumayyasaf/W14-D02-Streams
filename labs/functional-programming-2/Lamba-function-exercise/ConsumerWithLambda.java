import java.util.function.Consumer;

public class ConsumerWithLambda {
    public static void main(String[] args) {
        //1.2 Write a java consumer example with lambda which returns print statement 3 times.

        Consumer<String> consumer = (message) -> {
            System.out.println(message);
            System.out.println(message);
            System.out.println(message);
        };
        consumer.accept("Hello World");
        };
    }

