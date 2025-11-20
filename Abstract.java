abstract class A 
{
    public void show() 
    {
        System.out.println("Showing A!");
    }

    abstract public void hide();
}

class B extends A{
    public void hide()
    {
        System.out.println("Hiding B!");
    }
}


class Abs {

    public static void main(String a[]) {
        A obj = new B();
        obj.show();
        obj.hide();
    }
}