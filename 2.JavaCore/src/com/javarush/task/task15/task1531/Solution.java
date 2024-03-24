package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while(Integer.parseInt((key= reader.readLine()))<=150){
            int number=Integer.parseInt(key);
            if(number<0){
                System.out.println(0);
            }
            else if(number==0){
                System.out.println(1);
            }
            else{
                System.out.println(factorial(number));
            }
        }
    }

    public static String factorial(int n) {
        BigDecimal factor = new BigDecimal(1);
        for (int i = n; i !=1 ; i--) {
            factor=factor.multiply(BigDecimal.valueOf(i));
        }
        return factor.toString();
    }
}
