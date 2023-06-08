package ui;

import java.util.stream.Stream;

public class Printer {

    public static void printMenu(String[] items) {
        Stream.of(items).forEach(System.out::println);
    }

}
