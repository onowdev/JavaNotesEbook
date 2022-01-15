import java.util.Locale;
import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double p, l, luas;

        System.out.println("Masukan panjang nya");
        p = input.nextDouble();

        System.out.println("Masukan Lebar nya");

        l = input.nextDouble();

        luas = l * p;

        System.out.println("Jadi Luas Persegi Panjang tersebut adalah : " +luas+ "Cm");
    }
}
