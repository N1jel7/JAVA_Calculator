import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Logic logic = new Logic();

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the simplest calculator!");
        System.out.println("What method do you want to use?:");
        System.out.println("1. Write the full example.");
        System.out.println("2. Write the example by parts.");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:

                break;
            case 2:
                logic.secondMethod();
                break;

            default:
                System.out.println("You picked the wrong method, try again.");
        }

    }
}