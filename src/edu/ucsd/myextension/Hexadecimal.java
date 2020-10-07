package edu.ucsd.myextension;

public class Hexadecimal extends BaseConversions {
    Hexadecimal() {

    }

    public static String convertToDecimal(String number) {
        return baseToBase(number, 16, 10);
    }

    public static String convertToBinary(String number) {
        return baseToBase(number, 16, 2);
    }
}
