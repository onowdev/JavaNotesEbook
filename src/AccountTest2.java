import java.util.Scanner;

public class AccountTest2 {
    public static void main(String[] args) {
        Account account1 = new Account("Andra sugiono", 10000.00);
        Account account2 = new Account("Sugiono Devy", 7500.00);

        // display Initial Balance of Each Object
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getalance());

        //Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for Account1: "); //Prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // Add account1's balance

        //display balance
        System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getbalance());
    }
}
