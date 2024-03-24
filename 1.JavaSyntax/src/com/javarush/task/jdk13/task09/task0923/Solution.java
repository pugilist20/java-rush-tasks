package com.javarush.task.jdk13.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные буквы
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static StringBuilder vowelsString=new StringBuilder();
    public static StringBuilder others=new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String string= reader.readLine();
        String[] split=string.split(" ");
        for (String s : split) {
            for (int i = 0; i < s.length(); i++) {
                isVowel(s.charAt(i));
            }
        }
        System.out.println(vowelsString);
        System.out.println(others);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                character = Character.toLowerCase(character);
                vowelsString.append(vowel).append(" ");

                return true;
            }
        }
        others.append(character).append(" ");
        return false;

    }
}