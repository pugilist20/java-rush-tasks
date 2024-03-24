package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader fileReader=new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter=new FileWriter(args[1]);
        String str="";
        String str2="";
        while(fileReader.ready()){
            str=(fileReader.readLine());
            String[] strings=str.split(" ");
            for (String value : strings) {
                if(value.length()>=6){
                    str2+=value+" ";
                }
            }
            System.out.println(str2);
        }
        fileWriter.write(str2.replaceAll("\\p{Blank}",","));

        fileReader.close();
        fileWriter.close();
    }
}
