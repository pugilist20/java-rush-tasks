package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount=0;

    public static void main(String[] args) {
            System.out.println(new GenerateThread());

    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(String.format("%d", ++createdThreadCount));
            this.start();
        }
        public void run(){
            if(count>createdThreadCount){
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return getName()+" created";
        }
    }
}
