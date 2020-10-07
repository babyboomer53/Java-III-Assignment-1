package edu.ucsd.myextension;

public class Decimal extends BaseConversions {
    public static String convertToBinary(String number) {
        return baseToBase(number, 10, 2);
    }

    public static String convertToHexadecimal(String number) {
        return baseToBase(number, 10, 16);
    }
}
