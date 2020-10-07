package edu.ucsd.myextension;

public class Binary extends BaseConversions {
    public static String convertToDecimal(String number) {
        return baseToBase(number, 2, 10);
    }

    public static String convertToHexadecimal(String number) {
        return baseToBase(number, 2, 16);
    }
}
