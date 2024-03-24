package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream;
        while (true) {
            String str = reader.readLine();

            try {

                fileInputStream = new FileInputStream(str);
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(str);
                break;
            }
            reader.close();

        }
    }
}
