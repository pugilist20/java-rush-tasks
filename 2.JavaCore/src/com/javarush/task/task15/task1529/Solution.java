package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String key;
        if ((key=reader.readLine()).equals("helicopter")){
            result=new Helicopter();
        }
        if (key.equals("plane")){
         result=new Plane(5);
        }
        reader.close();
    }
}
