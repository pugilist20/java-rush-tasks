package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(reader.readLine()));
        ArrayList<String> file1 = new ArrayList<>();
        ArrayList<String> file2 = new ArrayList<>();
        while (fileReader1.ready() || fileReader2.ready()) {
            if (fileReader1.ready()) file1.add(fileReader1.readLine());
            else file2.add(fileReader2.readLine());
        }
        for (int i=0;i<file1.size();i++) {
            if(file1.get(i)==file2.get(i)){
                lines.add(new LineItem(Type.SAME, file1.get(i)));
            }
            else if(file1.get(i+1)==file2.get(i)){
                lines.add(new LineItem(Type.REMOVED, file1.get(i)));
            }
            else if(file1.get(i)==file2.get(i+1)){
                lines.add(new LineItem(Type.ADDED, file1.get(i)));
            }
        }
        reader.close();
        fileReader2.close();
        fileReader1.close();

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
