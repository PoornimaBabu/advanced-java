class CustomException extends Exception{
    public CustomException(String message)
    {
        super(message);
    }
}

public class TryCatch {
    public static void main(String[] args) {
        int data = 0;
        int score = 100;
        try {
            if (data == 0)
            {
                throw new CustomException("My life my rulesss.");
            }
            data = score / data;
        } catch (CustomException e) {
            System.out.println("Error: " + e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(data);
    }
}
