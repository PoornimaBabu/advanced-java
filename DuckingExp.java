class Test
{
    public int display(int value) throws ArithmeticException {
       return value / 0;
    }
}

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("NonExistentClass");
    }
}


public class DuckingExp {
    public static void main(String[] args) {
        Test t = new Test();
        t.display(10);
        System.out.println("After calling display method");
        A a = new A();
        try{
            a.show();
        } catch(ClassNotFoundException e){
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());

        }

    }
}
