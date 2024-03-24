package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
    }
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());

    }
    public static class Thread1 extends Thread{
        public void run() {
            while (true){

            }
        }
    }public static class Thread2 extends Thread{
        public void run() {
            if(isInterrupted()){
                System.out.println("InterruptedException");
            }
        }
    }public static class Thread3 extends Thread{
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }public static class Thread4 extends Thread implements Message{
        public void run() {
            while (!isInterrupted()){
            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
    public static class Thread5 extends Thread {
        public void run() {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String key;
            int sum=0;
            try {
                while (true) {
                    key=reader.readLine();
                    try {

                            sum+=Integer.parseInt(key);

                    }
                    catch (NumberFormatException e){
                        if(key.equals("N")){
                            System.out.println(sum);
                        }
                    }
                }
            }

            catch (IOException e) {
                System.out.println(sum);
            }

        }
    }
}