import java.util.Scanner;

public class ATM {
    /** Variables thay will be used when an ATM object is created. */
    private double currentBalance;
    private int machinePin;

    /**
     * Constructor for our ATM machine, instantiates initial balance and the pin to
     * access funds.
     */
    public ATM(double initialBalance, int pin) {
        this.currentBalance = initialBalance;
        this.machinePin = pin;
    }

    /** Menu for interacting with our account and its currentBalance. */
    public void displayMenu() {
        System.out.println("\n[ATM Machine]");
        System.out.println("==============================");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.println("==============================");
    }

    /** Prints out the currentBalance of the account. */
    public void checkBalance() {
        System.out.println("\nYour balance is: $" + currentBalance);
    }

    /**
     * Withdraw a certain amount from our currentBalance, does not allow to withdraw
     * 0 or more than currentBalance.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + currentBalance);
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    /** Add to the currentBalance in our account. */
    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Deposit successful. Updated balance: $" + currentBalance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public static void main(String[] args) {
        // Creating a new ATM object with an initial balance of 1000 and a pin of 1234
        ATM atmMachine = new ATM(1000.0, 1234); // initial balance and PIN

        // Creating a Scanner object to accept user input and check if entered pin is
        // the same with the stored pin.
        Scanner scanner = new Scanner(System.in);
        int enteredPin;

        System.out.print("Enter your PIN: ");
        enteredPin = scanner.nextInt();

        // If the entered pin is correct (1234), it will prompt the ATM menu.
        if (enteredPin == atmMachine.machinePin) {
            // Where we will be storing the choices of the user throughout the menu.
            int userChoice;

            // Loop that continually prints the menu while the user has not exited.
            do {
                atmMachine.displayMenu();
                System.out.print("Enter your choice: ");
                userChoice = scanner.nextInt();

                switch (userChoice) {
                    // Check the account balance.
                    case 1:
                        atmMachine.checkBalance();
                        break;
                    // Withdraw from the account.
                    case 2:
                        System.out.print("\nEnter withdrawal amount: $");
                        double withdrawAmount = scanner.nextDouble();
                        atmMachine.withdraw(withdrawAmount);
                        break;
                    // Deposit to the account.
                    case 3:
                        System.out.print("\nEnter deposit amount: $");
                        double depositAmount = scanner.nextDouble();
                        atmMachine.deposit(depositAmount);
                        break;
                    // Terminate the program.
                    case 4:
                        System.out.println("\nExiting. Thank you!");
                        break;
                    default:
                        System.out.println("\nInvalid choice. Please try again.");
                }

            } while (userChoice != 4); // do while loop runs while the userChoice is not 4
        } else {
            // Printing an error message if they enter an invalid choice.
            System.out.println("Incorrect PIN. Exiting.");
        }

        // Closing our Scanner object after terminating our program.
        scanner.close();

    }
}