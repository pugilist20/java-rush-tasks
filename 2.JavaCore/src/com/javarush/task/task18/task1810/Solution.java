package com.javarush.task.task18.task1810;

import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        while(true){
            FileInputStream fileReader=new FileInputStream(reader.readLine());

            if(fileReader.available()<1000){
                fileReader.close();
                reader.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
