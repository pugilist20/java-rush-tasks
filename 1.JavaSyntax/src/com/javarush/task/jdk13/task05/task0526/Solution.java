package com.javarush.task.jdk13.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1=new Man("Вася", 12, "Где-то");
        Man man2=new Man("Петя", 15, "Где-то там");
        Woman woman1=new Woman("Катя", 13, "Тоже где-то");
        Woman woman2=new Woman("Валерия", 25, "Тоже где-то там");
        System.out.println(man1.name+" "+man1.age+" "+man1.address+" ");
        System.out.println(man2.name+" "+man2.age+" "+man2.address+" ");
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address+" ");
        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address+" ");
    }
    public static class Man{
        private String name;
        private int age;
        private String address;
        public Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }
    public static class Woman{
        private String name;
        private int age;
        private String address;
        public Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }
}
