package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String lastName;
        private int age;
        private int height;
        private int weight;
        private String birthday;

        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(int age, int height, int weight) {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String lastName, String birthday) {
            this.name = name;
            this.lastName = lastName;
            this.birthday = birthday;
        }

        public Human(String lastName, int age, int height) {
            this.lastName = lastName;
            this.age = age;
            this.height = height;
        }

        public Human(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String name, String lastName, int age, int height, int weight, String birthday) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.birthday = birthday;
        }
    }
}
