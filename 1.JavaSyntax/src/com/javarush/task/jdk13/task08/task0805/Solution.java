package com.javarush.task.jdk13.task08.task0805;

import java.util.HashMap;
import java.util.Map;

/* 
Вывести на экран список значений
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");


    }

    public static void printValues(Map<String, String> map) {
        for (Map.Entry<String, String> pair:map.entrySet()){
            System.out.println(pair.getKey()+" - "+pair.getValue());
        }
    }
}
