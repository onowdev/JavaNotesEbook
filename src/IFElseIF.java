public class IFElseIF {
    public static void main(String[] args) {
        int number = 0;

        //Check if number is Greater than 0
        if(number > 0){
            System.out.println("Number is positive");
        }
        //Check if number is less than 0
        else if(number < 0){
            System.out.println("Number is Negative");
        }
        // if both condition is False
        else {
            System.out.println("The number is 0.");
        }
    }
}
