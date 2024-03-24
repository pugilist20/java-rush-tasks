package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        BufferedReader fileReader1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(reader.readLine()));
        String str;
        while((str=fileReader1.readLine())!=null){
            fileWriter.write(str);
            fileWriter.flush();
        }
        while((str=fileReader2.readLine())!=null){
            fileWriter.write(str);
            fileWriter.flush();

        }
        fileWriter.close();
        fileReader1.close();
        fileReader2.close();
    }
}
