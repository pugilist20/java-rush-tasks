package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
CRUD
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatForDateNo = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        SimpleDateFormat formatForDateN2o = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length - 2; i += 3) {
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], formatForDateN2o.parse(args[i + 2])));
                        } else {
                            allPeople.add(Person.createFemale(args[i], formatForDateN2o.parse(args[i + 2])));
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {

                    for (int i = 1; i < args.length - 2; i += 4) {

                        allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                        if (args[i + 2].equals("м")) {
                            allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                        } else {
                            allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                        }
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(formatForDateN2o.parse(args[i + 3]));
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i++) {
                        if ((allPeople.get(Integer.parseInt(args[i])).getSex()).equals(Sex.MALE)) {
                            System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " м " + formatForDateNo.format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
                        } else {
                            System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " ж " + formatForDateNo.format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
                        }
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i++) {

                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                    }
                }
                break;

        }
    }
}
