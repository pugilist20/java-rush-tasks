package com.javarush.task.task18.task1822;

import java.io.*;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2=new BufferedReader(new FileReader(reader.readLine()));
        while (reader2.ready()){
            String[] str=(reader2.readLine()).split(" ");
            if(str[0].equals(args[0])){
                for (String value :
                        str) {
                    System.out.print(value+" ");
                }
            }
        }
        reader2.close();
        reader.close();
    }
}
