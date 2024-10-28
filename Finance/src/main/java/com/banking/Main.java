package main.java.com.banking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import main.java.com.banking.utility.Account;
import main.java.com.banking.utility.Functions;

public class Main {
    // class Account {
    // private String accountNumber = "00000";
    // private String accountHolderName = "";
    // private double balance = 0.0;
    // }

    static void instruction() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Press 1 Create Account");
        System.out.println("Press 2  Deposit");
        System.out.println("Press 3  Withdraw");
        System.out.println("Press 4  Check Balance");
        System.out.println("Press 5  Change My Name");
        System.out.println("Press 0  Exit");
        System.out.println("-----------------------------------------------------");
        System.out.println("Enter your choice: ");
    }

    public static void main(String[] args) {
        System.out.println("Welcome JavaGeek Finance App");
        System.out.println("-----------------------------------------------------");
        Functions functions = new Functions();
        ArrayList<Account> accounts = new ArrayList<Account>();

        System.out.println("Insert your card by pressing '9'");

        try (Scanner input = new Scanner(System.in)) {
            int selection = input.nextInt();
            // try () {
            // }
            while (selection != 0) {
                instruction();
                int choice = input.nextInt();
                selection = choice;
                switch (choice) {
                    case 1:
                        functions.createAccount(accounts);
                        break;
                    case 2:
                        // depositToAccount();
                        break;
                    case 3:
                        // withdrawFromAccount();
                        break;
                    case 4:
                        // checkBalance();
                        break;
                    case 5:
                        // changeName();
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid option.");
                        break;
                }

            }
        }
        System.out.println("Thanks for banking with us");

    }
}