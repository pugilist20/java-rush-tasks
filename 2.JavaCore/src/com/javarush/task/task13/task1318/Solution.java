package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buReader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fI=new FileInputStream(buReader.readLine());
        Scanner scanner=new Scanner(fI);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        buReader.close();
        fI.close();
        scanner.close();
    }
}