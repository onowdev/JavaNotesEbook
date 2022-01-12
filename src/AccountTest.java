import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // Create s Scanner Object to Obtain input from the command window
        Scanner input = new Scanner(System.in);

        // Create an Account object and assign it to MyAccount
        Account myAccount = new Account();

        // display initial value of name (null)
        System.out.printf("Initial name is : %s%n%n", myAccount.getName());

        // Prompt for and read name
        System.out.println("Please Enter the name:");
        String theName = input.nextLine(); // Read a line of text
        myAccount.setName(theName); // put theName in myAccount
        System.out.println(); // outputs a blank line

        //Display the name stored in object myAccount
        System.out.printf("Name in Object myaccount is:%n%s%n", myAccount.getName());

    }
}
