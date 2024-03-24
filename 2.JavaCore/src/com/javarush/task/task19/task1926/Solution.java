package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader1=new BufferedReader(new FileReader(reader.readLine()));
        while(fileReader1.ready()){
            String str=fileReader1.readLine();
            char[] array = str.toCharArray();
            String result = "";
            for (int i = array.length - 1; i >= 0; i--) {
                result = result + array[i];
            }
            System.out.println(result);
        }

        reader.close();
        fileReader1.close();
    }
}
