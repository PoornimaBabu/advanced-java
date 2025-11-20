enum Status   //Status is a class
{
    Pending, Approved, Waitlisted, Rejected;
}


public class Enum {

    public static void main(String a[])
    {
        Status s = Status.Pending;
        System.out.println("Status : " + s);

        Status allStatus[] = Status.values();  //values() is a static method which returns an array of all enum constants
        for(Status status : allStatus){
            System.out.println("Status : " + status + " - " + status.ordinal()); //ordinal() returns the position of the enum constant
        }

        switch (s)
        {
            case Pending:
                System.out.println("Your application is still pending.");
                break;
            case Approved:
                System.out.println("Congratulations! Your application has been approved.");
                break;
            case Waitlisted:
                System.out.println("Your application is on the waitlist.");
                break;
            case Rejected:
                System.out.println("We regret to inform you that your application has been rejected.");
                break;
            default:
                System.out.println("Unknown status.");
        }
    }
}
