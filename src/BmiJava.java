public class BmiJava {
    //Deklarasi Variabel
    double weight, height, BMI;

    public BmiJava(double w, double h){
        weight= w;
        height = h;
    }

    public double hitungBMI(){
        return weight / (height * height);
    }

    // main method
    public static void main(String[] args) {
        BmiJava hitungBmiJava = new BmiJava(60, 1.80);
        double bmi = hitungBmiJava.hitungBMI();

        //Print BMi
        System.out.println("BMI anda " + bmi + ".");
    }
}
