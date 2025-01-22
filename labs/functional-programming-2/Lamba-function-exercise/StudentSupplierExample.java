import java.util.function.Supplier;

public class StudentSupplierExample {
    public static void main(String[] args) {
        //1.4.2 Supplier Example with Custom Class (Student)

        Supplier<Student> stud = () -> new Student(1, "John", "Male",25);
        Student student = stud.get();
        System.out.println(student);


    }
}
