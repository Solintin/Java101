package main.java.com.banking.utility;

import java.util.ArrayList;
import java.util.List;

public class Functions {
    public void createAccount(ArrayList<Account> accounts) {
        // Create a new account
        // Account account = new Account();
        Account obj = new Account("Alley Soliu", "12345", 1000.0);
        // obj.accountHolderName = "Alley Soliu";
        // obj.accountNumber = "12345";
        // obj.balance = 1000.0;
        try {
            accounts.add(obj);
            System.out.println("Account created successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
        for (Account ac : accounts) {
            System.out.println(String.format("Account Name: %s", ac.accountHolderName));
            System.out.println(String.format("Account No: %s", ac.accountNumber));
            System.out.println(String.format("Balance: %s", ac.balance));

        }
    }
}
