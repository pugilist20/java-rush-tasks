package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader(args[0]);
        int countSpaces=0;
        int countSymbols=0;
        int symbol;
        while ((symbol= reader.read())>0){
            if((char) symbol==' '){
                countSpaces++;

            }
            countSymbols++;
        }
        System.out.printf("%.2f",(((double) countSpaces/(double) countSymbols)*100));
        reader.close();
    }
}
