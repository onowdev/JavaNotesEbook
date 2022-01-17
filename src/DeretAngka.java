import java.util.Scanner;

public class DeretAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program membuat Deret Angka");
        System.out.println("===========================");
        System.out.println("");

        int jumlah_deret, i;

        System.out.println("Jumlah deret Yang di inginkan");
        jumlah_deret = input.nextInt();
        System.out.println("");

        for (i=1; i<=jumlah_deret; i++){
            System.out.println(i + " ");
        }
        System.out.println("");
    }
}
