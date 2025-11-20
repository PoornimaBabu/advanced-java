import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.lang.Comparable;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student s){
        return this.age > s.age ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class Comp {
    public static void main(String[] args) {
        // List<Integer> numbers = new ArrayList<Integer>();
        // numbers.add(44);
        // numbers.add(21);    
        // numbers.add(70);
        // numbers.add(10);

        List<Integer> numbers = Arrays.asList(44, 21, 70, 10);

        numbers.forEach(n -> System.out.println(n));

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Alice", 23));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 22));

        Comparator<Integer> comp = (Integer i, Integer j) -> i > j ? 1 : -1;
        numbers.sort(comp);
        System.out.println("Sorted List - " + numbers);

        Collections.sort(students);
        for(Student s : students){
            System.out.println(s.toString());
        }
    }
}
