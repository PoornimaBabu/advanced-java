enum Laptop 
{
    Dell(500), MacBook(2000), HP(1200), Asus(700);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }
}

public class EnumClass {
    public static void main(String a[])
    {
        for (Laptop lap : Laptop.values())
        {
            System.out.println("Laptop: " + lap + ", Price: $" + lap.getPrice());
        }
    }
}
