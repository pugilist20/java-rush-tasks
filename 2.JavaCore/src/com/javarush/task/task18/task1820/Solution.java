package com.javarush.task.task18.task1820;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream1 = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        byte[] bytes=new byte[fileInputStream1.available()];
        fileInputStream1.read(bytes);
        String[] str= (new String(bytes, StandardCharsets.UTF_8)).split(" ");
        for (int i = 0; i < str.length; i++) {
            fileOutputStream.write((((Math.round(Double.parseDouble(str[i])))+" ")).getBytes());
        }
        fileInputStream1.close();
        fileOutputStream.close();
    }
}
