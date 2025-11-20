import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter a number:");

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(reader);
        int number = 0;
        try {
            number = Integer.parseInt(bf.readLine());
        } catch(Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

        System.out.println(number);

        try {
            bf.close();
        } catch(IOException e) {
            System.out.println("Error closing reader: " + e.getMessage());
        }
        
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Enter another number:");
        
    }
}
