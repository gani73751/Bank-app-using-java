 import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account =
                new BankAccount(1001, "Rahul", 1234, 5000.0);

        System.out.println("Enter PIN:");
        int enteredPin = sc.nextInt();

        if (!account.login(enteredPin)) {
            System.out.println("Invalid PIN");
            return;
        }

        System.out.println("Login Successful");

        int choice;

        do {

            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.println("Enter deposit amount:");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.println("Enter withdrawal amount:");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    account.displayAccountDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using the Bank Application");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}