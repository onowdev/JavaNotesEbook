public class TypeConvertionSatu {
    //Implicit Casting
    public static void main(String[] args) {

        byte byteVar = 42;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;
        float floatVar = longVar;
        double doubleVar = floatVar;

        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(doubleVar);
    }

}
