package controlstatements;

import java.util.Scanner;

public class AcceptNumberUntilEnter0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter numbers ");

        
        do {
            number = scanner.nextInt();
            if (number != 0) {
                System.out.println("You entered: " + number);
            }
        } while (number != 0);

        System.out.println("Program ended. You entered 0.");
        scanner.close();
    }
}
