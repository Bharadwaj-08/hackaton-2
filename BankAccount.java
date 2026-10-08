import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int n, String name, double b) {
        accountNumber = n;
        accountHolderName = name;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account number: ");
        int number = sc.nextInt();

        System.out.print("Account holder name: ");
        String name = sc.next();

        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(number, name, balance);

        System.out.print("Deposit amount: ");
        account.deposit(sc.nextDouble());

        System.out.print("Withdraw amount: ");
        account.withdraw(sc.nextDouble());

        account.displayAccount();
    }
}