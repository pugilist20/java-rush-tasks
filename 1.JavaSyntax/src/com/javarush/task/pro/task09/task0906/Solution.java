package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String two="";
        if (decimalNumber <= 0) {
            return two;
        }

        while(decimalNumber!=0){
            two=decimalNumber%2+two;
            decimalNumber=decimalNumber/2;
        }

        return two;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        }
        double ten=0;
        for(int i=0; i<binaryNumber.length(); i++){
            ten=ten+Character.getNumericValue(binaryNumber.charAt(binaryNumber.length()-1-i))*Math.pow(2,i);
        }
        return (int) ten;

    }
}
