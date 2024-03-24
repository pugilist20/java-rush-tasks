package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        PrintStream first=System.out;
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        PrintStream second=new PrintStream(outputStream);
        System.setOut(second);
        testString.printSomething();
        FileOutputStream fileOutputStream=new FileOutputStream(reader.readLine());
        fileOutputStream.write(outputStream.toByteArray());
        System.setOut(first);
        System.out.println(outputStream.toString());
        reader.close();
        second.close();
        fileOutputStream.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

