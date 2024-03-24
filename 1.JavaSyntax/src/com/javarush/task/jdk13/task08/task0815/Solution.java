package com.javarush.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые имя и фамилия
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map=new HashMap<>();
        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Арнольд");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Ярослав");
        map.put("Новиков", "Александр");
        map.put("Козлов", "Михаил");
        map.put("Морозов", "Илья");
        map.put("Петров", "Алексей");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count=0;
        for (Map.Entry<String, String> value:map.entrySet()) {
            if(value.getValue()==name){
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count=0;
        for (Map.Entry<String, String> value:map.entrySet()) {
            if(value.getKey().equals(lastName)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Map<String, String> people=createMap();
        System.out.println(getCountTheSameFirstName(people, "Илья"));
        System.out.println(getCountTheSameLastName(people, "Морозов"));

    }
}
