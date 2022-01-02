public class JavaSwitch {
    public static void main(String[] args) {
        // Java Program to check the size
        // using the switch.. case statement

        int number = 78;
        String size = null;

        // switch statement to check size

        switch (number){
            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            case 78:
                size = "Large";
                break;
        }
        System.out.println("Size" +size);
    }
}
