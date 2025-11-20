import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Poorni", 88);
        students.put("Alice", 92);
        students.put("Bob", 75);    

        for(String name: students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }
    }
}
