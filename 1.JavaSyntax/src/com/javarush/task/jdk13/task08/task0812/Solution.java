package com.javarush.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        int count=1;
        int countMax=1;
        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i)==numbers.get(i+1)){
                count+=1;
                if(count>countMax){
                    countMax=count;
                }
            }
            else {
                count=1;
            }
        }
        System.out.println(countMax);
    }
}
