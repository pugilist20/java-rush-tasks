package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader fileReader=new BufferedReader(new FileReader(args[0]));
        while (fileReader.ready()){
            String[] strings=fileReader.readLine().split(" ");
            Calendar calendar=new GregorianCalendar(Integer.parseInt(strings[strings.length-1]), Integer.parseInt(strings[strings.length-2])-1, Integer.parseInt(strings[strings.length-3]));
            Date date=calendar.getTime();
            if(strings.length==4){
                PEOPLE.add(new Person(strings[0], date));
            }
            else if(strings.length==5){
                PEOPLE.add(new Person(strings[0]+" "+strings[1], date));
            }
            else if(strings.length==6){
                PEOPLE.add(new Person(strings[0]+" "+strings[1]+" "+strings[2], date));
            }
        }
        fileReader.close();
    }
}
