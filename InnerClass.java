class Outer 
{
    public void showOuter()
    {
        System.out.println("Showing Outer Class!");
    }

    class Inner
    {
        public void showInner()
        {
            System.out.println("Showing Inner Class!");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.showOuter();

        Outer.Inner inner = outer.new Inner();
        inner.showInner();
    }
}
