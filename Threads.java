class A extends Thread
{
    public void run() {
       for (int i=1; i<=100; i++){
            System.out.println("i = " + i);
       }
    }
}

class B extends Thread
{
    public void run() {
        for (int j=1; j<=100; j++){
            System.out.println("j = " + j);
            try
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
                System.out.println(e);  
            }
       }
    }
}

public class Threads {
    public static void main(String[] args) {
       A a = new A();
       B b = new B();

       a.start();
       b.start();

       
    }
}
