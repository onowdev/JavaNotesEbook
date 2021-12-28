public class TypeConvertionDua {
    public static void main(String[] args) {
        //Explicit casting
        double doubleVar = 49.0d;
        float floatVar = (float) doubleVar;
        long longVar = (long) floatVar;
        int intVar = (int) longVar;
        short shortVar = (short) intVar;
        byte byteVar = (byte) shortVar;

        System.out.println(doubleVar);
        System.out.println(floatVar);
        System.out.println(longVar);
        System.out.println(intVar);
        System.out.println(shortVar);
    }
}
