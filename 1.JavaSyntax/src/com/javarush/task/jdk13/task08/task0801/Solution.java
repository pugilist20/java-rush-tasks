package com.javarush.task.jdk13.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("арбуз");
        fruits.add("банан");
        fruits.add("вишня");
        fruits.add("груша");
        fruits.add("дыня");
        fruits.add("ежевика");
        fruits.add("женьшень");
        fruits.add("земляника");
        fruits.add("ирис");
        fruits.add("картофель");
        for (String value:fruits) {
            System.out.println(value);
        }



    }
}
