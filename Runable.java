class Counter {
    int count;
    public synchronized void increment()
    {   
        count++;
    }
}

class Runable {
    public static void main(String args[]) throws InterruptedException {
        Counter c = new Counter();
        Runnable a = () -> {
            for (int i=1; i<=10000; i++){
                c.increment();
            }
        };
        Runnable b = () -> {
            for (int j=1; j<=10000; j++){
                c.increment();
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        
        t1.start();
        t2.start();

        t1.join(); //join() is used to make the main thread wait until t1 is finished
        t2.join();

        System.out.println("Final count: " + c.count);
    }
}