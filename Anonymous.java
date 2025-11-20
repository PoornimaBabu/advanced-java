class A{
    public void display(){
        System.out.println("Hello from Anonymous class");
    }
}

abstract class B{
    abstract void msg();
}

public class Anonymous {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        A b = new A(){
            public void display() {
                System.out.println("Hello from Anonymous subclass");
            }
        };
        b.display();
        B obj = new B(){
            void msg() {
                System.out.println("Hello from Anonymous abstract class");
            }
        };
        obj.msg();
    } 
}
