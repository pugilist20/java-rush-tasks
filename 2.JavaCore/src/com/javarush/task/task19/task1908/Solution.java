package com.javarush.task.task19.task1908;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1="C:\\Users\\ogrrn\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1908\\file1.txt";
        String str2="C:\\Users\\ogrrn\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1908\\file2.txt";
        BufferedReader fileReader=new BufferedReader(new FileReader(str1));
        BufferedWriter fileWriter=new BufferedWriter(new FileWriter(str2));
        String str = "";
        while (fileReader.ready()) {
            str += (char) fileReader.read();
        }
        System.out.println(str);
        String[] string = str.split(" ");
        for (String value : string) {
            if (value.matches("-?\\d+")) {
                fileWriter.write(value+" ");
            }
        }
        reader.close();
        fileWriter.close();
        fileReader.close();
    }
}
