package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
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
        String[] str=outputStream.toString().split(" ");
        if(str[1].equals("+")){
            System.out.println(outputStream.toString()+(Integer.parseInt(str[0])+Integer.parseInt(str[2])));
        }
        else if(str[1].equals("-")){
            System.out.println(outputStream.toString()+(Integer.parseInt(str[0])-Integer.parseInt(str[2])));
        }
        else if(str[1].equals("*")){
            System.out.println(outputStream.toString()+(Integer.parseInt(str[0])*Integer.parseInt(str[2])));
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

