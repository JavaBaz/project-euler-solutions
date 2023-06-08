package ui;

import java.util.Scanner;

public class RunApp {
    static Scanner scanner = new Scanner(System.in);

    public static void run() {

        int choice;
        do {
            Printer.printMenu(Menu.STARTMENU);
            Printer.printMessage("Enter your choice : ");

            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Showing problems to user ...");

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