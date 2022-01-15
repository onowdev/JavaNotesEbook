import java.util.Locale;
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Masukan Radius Lingkaran nya");

        double pi= 3.14, r, luas;

        System.out.println("Masukan Radius nya");

        r = input.nextDouble();

        luas = pi * r * r;

        System.out.println("Luas Lingkaran adalah: " +luas);

    }
}
