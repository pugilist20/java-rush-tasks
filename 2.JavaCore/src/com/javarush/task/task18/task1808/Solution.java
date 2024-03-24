package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader=new FileInputStream(reader.readLine());
        FileOutputStream fileWriter1=new FileOutputStream(reader.readLine());
        FileOutputStream fileWriter2=new FileOutputStream(reader.readLine());
        byte[] bytes=new byte[fileReader.available()+1];
        int count=fileReader.read(bytes);
        int byteCount = count % 2 == 0 ? count / 2 : count / 2 + 1;
        fileWriter1.write(bytes, 0, byteCount);
        fileWriter2.write(bytes, byteCount , count / 2);
        reader.close();
        fileReader.close();
        fileWriter1.close();
        fileWriter2.close();
    }
}
