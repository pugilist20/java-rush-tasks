package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        String stringBuilder=new String();
        while(fileReader.ready()){
            stringBuilder+=fileReader.read();
        }
        for (int i = 1; i < stringBuilder.length(); i+=2) {
            fileWriter.write(stringBuilder.charAt(i));
        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
