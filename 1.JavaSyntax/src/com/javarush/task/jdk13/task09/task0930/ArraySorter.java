package com.javarush.task.jdk13.task09.task0930;
public class ArraySorter {
    public void sort(String[] array) {
        int indexNum=-1;
        int indexStr=-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(isNumber(array[i]) && isNumber(array[j])){
                    if(Integer.parseInt(array[i]) < Integer.parseInt(array[j])){
                        String temp=array[j];
                        array[j]=array[i];
                        array[i]=temp;
                    }
                }
                else if(!isNumber(array[i]) && !isNumber(array[j])){
                    if(isGreaterThan(array[i], array[j])){
                        String temp=array[j];
                        array[j]=array[i];
                        array[i]=temp;
                    }
                }
            }
        }
    }

    public boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public boolean isNumber(String text) {
        if (text.isEmpty()) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if ((i != 0 && character == '-') // Строка содержит '-'
                    || (!Character.isDigit(character) && character != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && character == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
