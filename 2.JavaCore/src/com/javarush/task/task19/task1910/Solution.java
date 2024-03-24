package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter=new BufferedWriter(new FileWriter(reader.readLine()));
        ArrayList<String> file=new ArrayList<>();
        while (fileReader.ready()){
            file.add((fileReader.readLine()));
        }
        for (String value:file) {
            fileWriter.write(value.replaceAll("\\p{P}", ""));
        }
    }
}
