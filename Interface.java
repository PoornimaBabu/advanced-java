interface User {

    String name = "Poorni Prasath";
    double salary = 1000000.00;

    void getDetails();
    void calculateSalary();
}

@FunctionalInterface
interface Admin 
{
    void getAdminDetails();
    // void test(); // This will cause a compilation error as Functional Interface can have only one abstract method
}

interface SuperAdmin extends User, Admin { // Interface Inheritance
    void superAdminMethod();

}

class UserDetails implements User, Admin {
    public void getDetails() {
        System.out.println("Name: " + name);
    }

    public void calculateSalary() {
        System.out.println("Salary: " + salary);
    }

    public void getAdminDetails() {
        System.out.println("Admin Details: Access Granted");
    }
}

public class Interface {
    public static void main(String[] args) {
        User user = new UserDetails();
        user.getDetails();
        System.out.println("----- " + User.name);
    }
}
