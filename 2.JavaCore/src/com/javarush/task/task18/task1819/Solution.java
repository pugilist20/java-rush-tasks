package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        BufferedWriter fileWriter1 = new BufferedWriter(new FileWriter(file1));
        BufferedReader fileReader1 = new BufferedReader(new FileReader(file1));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(reader.readLine()));
        StringBuilder file1s= new StringBuilder();
        while ((file1=fileReader2.readLine())!=null){
            file1s.append(file1);
        }


    }
}
