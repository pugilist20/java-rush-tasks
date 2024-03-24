package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!(str = reader.readLine()).equals("exit")) {
            new ReadThread(str).start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        String filename;

        public ReadThread(String fileName) {
            this.filename = fileName;
        }

        @Override
        public void run() {
            try {
                byte[] bytes = new byte[256];
                FileInputStream fileInputStream = new FileInputStream(filename);
                while (fileInputStream.available() > 0) {
                    bytes[fileInputStream.read()]++;
                }

                fileInputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
