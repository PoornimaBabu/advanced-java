import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class ConstructorRef {
    public static void main() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Student> students = names.stream()
                                    //   .map(name -> new Student(name))
                                      .map(Student::new)
                                      .toList();

        students.forEach(System.out::println);
    }
}