package com.packagechallenge;
import java.lang.*;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Process process = new Process();

    public static void main(String[] args) {

        boolean exit = false;
        while (!exit) {
            String userInput = scanner.nextLine();

            if (userInput.equals("/exit")) {
                System.out.println("Bot: [" + process.getFormattedDate() + "]: Ok, szia!");
                exit = true;
            } else if(userInput.equals("/history")) {
                System.out.println(String.join("\n", process.getHistory()));
            } else {
                System.out.println(process.addHistoryUser(userInput));
                System.out.println(process.addHistoryBot());
            }
        }
    }
}
