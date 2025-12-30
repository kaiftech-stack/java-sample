import java.util.Scanner;

public class BankingProgram {

    // Java banking program
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            System.out.println("BANKING PROGRAM");
            System.out.println("****************************");
            System.out.println("1. show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************************");

            System.out.println("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    showbalance(balance);
                    break;

                case 2:
                    balance += deposit();
                    break;

                case 3:
                    balance -= withdraw(balance);
                    break;

                case 4:
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        sc.close();
        System.out.println("PROGRAM ENDS");
    }

    static void showbalance(double balance) {
        System.out.println(balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter the amount to be deposited: ");
        amount = sc.nextInt();
        if (amount < 0) {
            System.out.println("invalid amount");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("enter the amount you want to withdraw: ");
        amount = sc.nextInt();
        if (amount > balance) {
            System.out.println("insufficient balance can't process");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
}
