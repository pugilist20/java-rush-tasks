package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader=new FileInputStream(reader.readLine());
        FileOutputStream fileWriter1=new FileOutputStream(reader.readLine());
        ArrayList<Byte> bytes=new ArrayList<>();
        while(fileReader.available()>0){
            byte byte1= (byte) fileReader.read();
            bytes.add( 0, byte1);
        }
        for (Byte value:bytes) {
            fileWriter1.write(value);
        }
        fileReader.close();
        fileWriter1.close();
    }
}
