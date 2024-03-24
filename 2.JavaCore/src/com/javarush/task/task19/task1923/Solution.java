package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.Arrays;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);
        while (fileReader.ready()) {
            String[] strings = fileReader.readLine().split(" ");
            for (String value : strings) {
                if (value.matches(".*[0-9].*")){
                    fileWriter.write(value+" ");
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
