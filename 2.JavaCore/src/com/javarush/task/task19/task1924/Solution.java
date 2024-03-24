package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(12, "двенадцать");
        map.put(11, "одиннадцать");
        map.put(10, "десять");
        map.put(9, "девять");
        map.put(8, "восемь");
        map.put(7, "семь");
        map.put(6, "шесть");
        map.put(5, "пять");
        map.put(4, "четыре");
        map.put(3, "три");
        map.put(2, "два");
        map.put(1, "один");
        map.put(0, "ноль");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        while (fileReader.ready()) {
            String[] strings = fileReader.readLine().split("\\b");
            for (String value : strings) {
                try {
                    String str = (map.getOrDefault(Integer.parseInt(value), "true"));
                    if (!str.equals("true")) {
                        System.out.print(map.get(Integer.parseInt(value)));
                    }
                    else{
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ignor) {
                    System.out.print(value);
                }

            }
            System.out.println();
        }
        reader.close();
        fileReader.close();
    }
}
