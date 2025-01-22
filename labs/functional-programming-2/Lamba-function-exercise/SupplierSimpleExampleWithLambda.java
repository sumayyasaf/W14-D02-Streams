import java.util.function.Supplier;

public class SupplierSimpleExampleWithLambda {
    public static void main(String[] args) {
        //1.4.1 Supplier Example with Lambda
        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());


    }
}
