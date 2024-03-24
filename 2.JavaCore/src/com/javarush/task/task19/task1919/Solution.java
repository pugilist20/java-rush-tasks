package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> values=new TreeMap<>();
        BufferedReader reader=new BufferedReader(new FileReader(args[0]));
        while(reader.ready()){
            String[] strings=reader.readLine().split(" ");
            if (values.containsKey(strings[0])){
                values.put(strings[0], values.get(strings[0])+Double.parseDouble(strings[1]));
            }
            else{
                values.put(strings[0], Double.parseDouble(strings[1]));
            }
        }
        Map<String, Double> sortedMap = new TreeMap<>(values);
        sortedMap.entrySet().forEach(System.out::println);
        reader.close();
    }
}
