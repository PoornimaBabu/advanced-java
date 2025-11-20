import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String a[]){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        String name = names.stream()
                            .filter(n ->n.startsWith("A"))
                           .findFirst()
                           .orElse("No name found");

        Optional<String> name1 = names.stream().filter(n ->n.startsWith("P"))
                           .findFirst();
        System.out.println(name);
        System.out.println(name1.orElse("No name found"));
    }
}