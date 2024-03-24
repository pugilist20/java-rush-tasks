package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatForDateNo = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        SimpleDateFormat formatForDateN2o = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

            if(Objects.equals(args[0], "-c")){
                if(args[2].equals("м")){
                    allPeople.add(Person.createMale(args[1], new Date(args[3]) ) );
                }
                else{
                    allPeople.add(Person.createFemale(args[1], new Date(args[3]) ) );
                }
                System.out.println(allPeople.size()-1);
            }
            else if(Objects.equals(args[0], "-r")){
                if((allPeople.get(Integer.parseInt(args[1])).getSex()).equals(Sex.MALE)){
                    System.out.println(allPeople.get(Integer.parseInt(args[1])).getName()+" м "+formatForDateNo.format( allPeople.get(Integer.parseInt(args[1])).getBirthDate()));
                }
                else{
                    System.out.println(allPeople.get(Integer.parseInt(args[1])).getName()+" ж "+formatForDateNo.format( allPeople.get(Integer.parseInt(args[1])).getBirthDate()));
                }

            }
            else if(Objects.equals(args[0], "-u")){
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                if(args[3].equals("м")){
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
                }
                else{
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                }
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(formatForDateN2o.parse(args[4]));
            }
            else if(Objects.equals(args[0], "-d")){
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                allPeople.get(Integer.parseInt(args[1])).setName(null);
            }

    }
}
