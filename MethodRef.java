import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("poorni", "prasath", "sundal");
        List<String> upperNames = names.stream()
                                    //    .map(n -> n.toUpperCase())
                                        .map(String::toUpperCase)
                                        .toList();
        upperNames.forEach(System.out::println);
    }
}