package main.java.com.banking.utility;

public class Account {
    String accountNumber;
    String accountHolderName;
    double balance;

    Account(String acctNo, String acctName, double bal) {
        this.accountHolderName = acctName;
        this.accountNumber = acctNo;
        this.balance = bal;
    }
}
