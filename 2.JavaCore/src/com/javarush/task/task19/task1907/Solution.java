package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try(FileReader fileReader=new FileReader(reader.readLine())){
            String str="";
            while(fileReader.ready()){
                str+=fileReader.read();
            }
            str=str.replaceAll("\\p{P}"," ");
            str=str.replaceAll("\\s"," ");
            String[] strings=str.split(" ");
            int count=0;
            for (String string:strings) {
                if(string.equals("world")){
                    count++;
                }
            }
            System.out.println(count);
            reader.close();
            fileReader.close();

        }

    }
}
