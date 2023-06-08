package ui;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class RunApp {
    static Scanner scanner = new Scanner(System.in);

    public static void run() {

        int choice;
        do {
            Printer.printMenu(Menu.START_MENU);
            Printer.printMessage("Enter your choice : ");

            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1 -> showProblems();
                case 2 -> System.out.println("Showing about menu to user ...");
                case 0 -> System.out.println("Exiting the program. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 0);

        scanner.close();
    }


    public static void showProblems() {
        Printer.printMessage("Enter the number of the problem: ");
        int problemNumber = scanner.nextInt();

        String problemClassName = String.format("P%03d", problemNumber);
        String fullyQualifiedClassName = "problem." + problemClassName;

        try {
            Class<?> problemClass = Class.forName(fullyQualifiedClassName);
            Method problemMethod = problemClass.getDeclaredMethod("main", String[].class);

            Constructor<?> constructor = problemClass.getDeclaredConstructor();
            Object instance = constructor.newInstance();
            problemMethod.invoke(instance, (Object) null);
        } catch (ClassNotFoundException e) {
            System.out.println("This problem does not exist.");
        } catch (NoSuchMethodException e) {
            System.out.println("The specified problem does not have a 'main' method.");
        } catch (IllegalAccessException e) {
            System.out.println("An error occurred while accessing the 'main' method.");
            e.printStackTrace();
        } catch (InstantiationException e) {
            System.out.println("An error occurred while creating an instance of the problem class.");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            System.out.println("An error occurred while running the problem.");
            e.printStackTrace();
        }
    }




}