package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fI=new FileInputStream(reader.readLine());
        Scanner scanner=new Scanner(fI);
        String line;
        while(scanner.hasNextLine()){
            if(!(line=scanner.nextLine()).equals("exit")){

            }
        }
    }
}
