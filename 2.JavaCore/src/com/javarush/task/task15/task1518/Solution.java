package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;

    public static void main(String[] args) {

    }
    static {
        cat=new Cat();
        cat.name="vasya";
        System.out.println(cat.name);

    }
    static class Cat{
        public String name;
    }
}
