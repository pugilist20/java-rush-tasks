package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        try{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String firstFileName=reader.readLine();
        String secondFileName= reader.readLine();
        BufferedReader br1=new BufferedReader( new FileReader(firstFileName));
        BufferedReader br2=new BufferedReader(new FileReader(secondFileName));
        String string;
        while((string=br1.readLine())!=null){
            allLines.add(string);
        }
        while((string=br2.readLine())!=null){
            forRemoveLines.add(string);
        }
        new Solution().joinData();
        reader.close();
        br1.close();
        br2.close();} catch (Exception e){
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        int count=0;
        for (String allLine : allLines) {
            for (String forRemoveLine : forRemoveLines) {
                if (allLine.equals(forRemoveLine)) {
                    count++;
                }
            }
        }
        if(count==forRemoveLines.size()){
            for (int i = 0; i < allLines.size(); i++) {
                for (String forRemoveLine : forRemoveLines) {
                    if (allLines.get(i).equals(forRemoveLine)) {
                        allLines.remove(i);
                    }
                }
            }
        }
        else{
            while(!allLines.isEmpty()){
                allLines.remove(allLines.size()-1);
            }
            throw new CorruptedDataException();
        }
    }
}
