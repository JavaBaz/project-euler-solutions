package ui;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);


    public static void run() {
        int choice;
        do {
            System.out.println("================");
            System.out.println("Options:");
            System.out.println("1. Select a Problem");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    selectAProblem();



                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 0);

        scanner.close();
    }

}
