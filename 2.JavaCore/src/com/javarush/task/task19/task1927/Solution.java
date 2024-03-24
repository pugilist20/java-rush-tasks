package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream1=new PrintStream(System.out);
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        PrintStream printStream2=new PrintStream(byteArrayOutputStream);
        System.setOut(printStream2);
        testString.printSomething();
        String[] strings=byteArrayOutputStream.toString().split("\n");
        System.setOut(printStream1);
        for (int i = 0; i < strings.length; i++) {
            if(i%2!=0){
                System.out.println(strings[i]);
                System.out.println("JavaRush - курсы Java онлайн");
            }
            else{
                System.out.println(strings[i]);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
