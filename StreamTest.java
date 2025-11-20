import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(100));
        }
        int result = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2)
            .mapToInt(i -> i)
            .sum();    
        System.out.println("Sum of doubled even numbers: " + result); 
    }
}