import java.util.Scanner;
import java.util.Locale;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Program Luas Segitiga");
        System.out.println("Masukan Variabel-variabel nya");

        double a,t, luas;

        System.out.println("Masukan Alas Segitiga");
        a = input.nextDouble();

        System.out.println("Masukan Tinggi Segitiga");
        t = input.nextDouble();

        luas = 0.5 * a * t;

        System.out.println("Luas Segitiga: " +luas);
    }
}
