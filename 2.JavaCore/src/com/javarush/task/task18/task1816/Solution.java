package com.javarush.task.task18.task1816;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[0]);
        int c;
        int count = 0;
        while ((c = reader.read()) > 0) {
            if (((char) c >= 'a' && (char) c <= 'z') || ((char) c >= 'A' && (char) c <= 'Z')) {
                count += 1;
            }
        }
        System.out.println(count);
        reader.close();
    }
}
