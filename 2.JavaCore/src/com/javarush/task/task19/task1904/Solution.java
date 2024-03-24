package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        Scanner scanner;
        public void PersonScannerAdapter(Scanner scanner){
            this.scanner=scanner;
        }
        @Override
        public Person read() throws IOException {
            String str=scanner.nextLine();
            String[] strings=str.split(" ");

            return null;
        }

        @Override
        public void close() throws IOException {

        }
    }
}
