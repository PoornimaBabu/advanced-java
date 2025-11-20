@FunctionalInterface
interface Test 
{
    void display(String message);
}

@FunctionalInterface
interface Add
{
    int add(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        // Usual way using Anonymous class
        Test test = new Test(){
            public void display(String message) {
                System.out.println("Message from Anonymous class: " + message);
            }
        };
        // Lambda expression way
        Test test1 = message -> System.out.println("Message from Lambda expression: " + message);
        test.display("Hello, World!");
        test1.display("Hello, Lambda!");

        Add add = (i, j) -> i + j;
        add.add(5,6);
        System.out.println("Sum using Lambda expression: " + add.add(5, 6));
    }
}
