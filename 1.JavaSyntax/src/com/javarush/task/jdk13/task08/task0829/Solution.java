package com.javarush.task.jdk13.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Нужно добавить в программу новую функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (!Objects.equals(reader.readLine(), "")) {
            list.add(reader.readLine());
            list.add(reader.readLine());
        }

        String city=reader.readLine();
        for ( int i=0; i<list.size()-1;i+=1){
            if(list.get(i).equals(city)){
                System.out.println(list.get(i+1));
            }
        }
    }
}
