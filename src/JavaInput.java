import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nomor: ");
        int number = input.nextInt();
        System.out.println("Anda Memasukan Nomor" + " " + number);

        // closing the scanner object
        input.close();
    }
}
