import java.util.Scanner;
public class AddInputInteger {

    public static void main(String[] args) {
        // Create a Scanner to obtain input from the command Window
        Scanner input = new Scanner(System.in);

        int number1; // First integer to add
        int number2; // Second integer to add

       // int sum = 0;// sum of number1 and number2

        System.out.println("Masukan ANgka pertama");
        number1 = input.nextInt();

        System.out.println("masukan Angka Kedua");
        number2 = input.nextInt();


        System.out.printf("Sum is %d%n", (number1 + number2));
    }
}
