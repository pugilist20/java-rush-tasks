package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка
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
        System.out.println(outputStream.toString().toUpperCase());


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
