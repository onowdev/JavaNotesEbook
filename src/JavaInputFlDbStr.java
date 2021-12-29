import java.sql.SQLOutput;
import java.util.Scanner;

class JavaInputFlDbStr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Memperoleh Floating Input an
        System.out.println("Masukan Angka bertipe float");
        float myfloat = input.nextFloat();
        System.out.println("angka Float nya"+" "+myfloat);

        //Memperoleh inputan bertipe double
        System.out.println("Masukan Angka bertipe double");
        double mydouble = input.nextDouble();
        System.out.println("Angka double nya"+" "+mydouble);

        //Memperoleh Input an data bertipe String

        System.out.println("enter text: ");
        String myString = input.next();
        System.out.println("anda mengatakan"+" "+myString);
    }

}
