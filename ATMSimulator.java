import java.util.Scanner;

public class ATMSimulator {
    private static double balance = 1000.0; // BANK BALANCE
    private static final int PIN = 1234;    // USER PIN

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM!");

        // CHECKING PIN 
        System.out.print("Enter your 4-digit PIN: ");
        int enteredPin = sc.nextInt();
        if (enteredPin != PIN) {
            System.out.println("Incorrect PIN. Access Denied!");
            return;
        }

        int choice;
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(sc);
                    break;
                case 3:
                    withdrawMoney(sc);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }

    // ALL ATM FUNCTIONS
    public static void checkBalance() {
        System.out.printf("Your current balance is: RUP %.2f\n", balance);
    }

    public static void depositMoney(Scanner sc) {
        System.out.print("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("RUP %.2f deposited successfully!\n", amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public static void withdrawMoney(Scanner sc) {
        System.out.print("Enter amount to withdraw: RUP ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("RUP %.2f withdrawn successfully!\n", amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
