import java.security.SecureRandom;
public class RandomAngka {
    public static void main(String[] args) {
        SecureRandom rng = new SecureRandom();
        /*Cetak Angka Random 32-bit Integer*/
        System.out.println(rng.nextInt());
    }
}
