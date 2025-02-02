package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution  {
    public static List<String> lines = new ArrayList<String>();
    public static int ch;
    public static FileReader fr;

    static {
        try {
            fr = new FileReader(Statics.FILE_NAME);
            BufferedReader reader=new BufferedReader(fr);
            String line= reader.readLine();
            while((line)!=null){
                lines.add(line);
                line= reader.readLine();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        System.out.println(lines);
    }
}
