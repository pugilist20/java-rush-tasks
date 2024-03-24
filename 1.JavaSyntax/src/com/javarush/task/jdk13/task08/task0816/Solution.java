package com.javarush.task.jdk13.task08.task0816;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Удалить всех людей, родившихся летом
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JUNE 1 2012"));
        map.put("Кузнецов", dateFormat.parse("JULY 1 2012"));
        map.put("Соколов", dateFormat.parse("AUGUST 1 2012"));
        map.put("Попов", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Лебедев", dateFormat.parse("MAY 1 2012"));
        map.put("Новиков", dateFormat.parse("JUNE 1 2012"));
        map.put("Козлов", dateFormat.parse("JUNE 1 2012"));
        map.put("Морозов", dateFormat.parse("JUNE 1 2012"));
        map.put("Петров", dateFormat.parse("JUNE 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy=new HashMap<>(map);
        for (Map.Entry<String, Date> value: copy.entrySet()) {
            String date=value.getValue().toString();
            if(date.contains("Aug")){
                map.remove(value.getKey());
            }
            else if(date.contains("Jul")){
                map.remove(value.getKey());
            }
            else if (date.contains("Jun")){
                map.remove(value.getKey());
            }
        }

    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> birthdays=createMap();
        removeAllSummerPeople(birthdays);
        System.out.println(birthdays);
    }
}
