package com.javarush.task.jdk13.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Максимальное и минимальное числа в массиве
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers=new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i]=Integer.parseInt(reader.readLine());
        }
        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;
        for(int value:numbers){
            if(value>maximum){
                maximum=value;
            }
            if (value<minimum) {
                minimum = value;
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
