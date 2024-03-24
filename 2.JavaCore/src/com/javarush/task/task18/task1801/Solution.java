package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader=new FileInputStream(reader.readLine());
        int max=0;
        int byt;
        while (fileReader.available()>0){
            if((byt=fileReader.read())>max){
                max=byt;
            }
        }
        System.out.println(max);
        reader.close();
        fileReader.close();
    }
}
