package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInputStream=new FileInputStream(args[0]);
        byte[] symbols=new byte[256];
        while(fileInputStream.available()>0){
            byte symbol= (byte) fileInputStream.read();
            symbols[symbol]++;
        }
        int i=0;
        for (byte value : symbols) {
            if(value!=0) {
                System.out.println((char)i  + " " + value);
            }
            i++;

        }
        fileInputStream.close();
    }
}
