package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream first=System.out;
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        PrintStream second=new PrintStream(outputStream);
        System.setOut(second);
        testString.printSomething();
        System.setOut(first);
        System.out.println(outputStream.toString().replaceAll("[a-zA-Z\\p{P}\\p{Blank}]",""));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
