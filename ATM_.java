import java.util.Scanner;
public class ATM__ {
    static double totalAmt = 100000;
	public static Object sc;

    public static void withdraw(double amount) {
    	
        if (amount <= totalAmt && amount > 0) {
            totalAmt -= amount;
            System.out.println("Withdrawn amount: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a valid amount.");
        }

        displayBalance();
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            totalAmt += amount;
            System.out.println("Deposited amount: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a valid amount.");
        }

        displayBalance();
    }

    public static void checkBalance() {
        System.out.println("The balance amount in your account is: " + totalAmt);
    }

    public static void displayBalance() {
        System.out.println("Current Balance: " + totalAmt);
    }
}

class ATM2 {
    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Main menu");
            System.out.println("0 - Exit");
            System.out.println("1 - Withdraw");
            System.out.println("2 - Deposit");
            System.out.println("3 - Check Balance");

            System.out.print("Enter your choice: ");
            choice =sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Thank you for visiting!");
                    break;
                case 1:
                	 System.out.println("Enter the amount you would like to withdraw:");
                     double amountToWithdraw = sc.nextDouble();
                     ATM__.withdraw(amountToWithdraw);
                     break;
                case 2:
                	System.out.println("Enter the amount you would like to deposit:");
                    double amountToDeposit = sc.nextDouble();
                    ATM__.deposit(amountToDeposit);
                    break;
                case 3:
                    ATM__.checkBalance();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);
        sc.close();
        
        
    }
   
    
}