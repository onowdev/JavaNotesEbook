public class JavaNestedIfElse {
    public static void main(String[] args) {

        //deklarasi Variabel Tipe Double
        Double n1 = -1.0, n2= 4.5, n3 = -5.3, largest;

        //Cek jika n1 lebih besar atau sama nilai nya dengan n2
        if(n1>=n2){

            // Jika if else Statement di dalam if block
            // cek jika n1 lebih besar atau bernilai sama dengan n3
            if (n1 >= n3){
                largest = n1;
            }

            else {
                largest = n3;
            }
        } else {
            // Jika Statement di dalam block Else
            // cek jika n2 lebih besar dari / samadengan n3
            if(n2 >=n3){
                largest = n2;
            }
            else {
                largest = n3;
            }
        }

        System.out.println("Largest Number Is " + largest);
    }
}
