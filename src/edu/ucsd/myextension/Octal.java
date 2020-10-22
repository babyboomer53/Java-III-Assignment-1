package edu.ucsd.myextension;

public class Octal extends BaseConversions {

    public static String convertToDecimal(String number) {
        return baseToBase(number, 8, 10);
    }

    public static String convertToBinary(String number) {
        return baseToBase(number, 8, 2);
    }

}
