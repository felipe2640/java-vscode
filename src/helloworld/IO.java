package helloworld;

import java.util.Scanner;

public class IO {
    public static void TestInput(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Whats your name?"); // output
            String name = reader.nextLine();
            System.out.println("Nice to meet you " + name);
        }

    }
}