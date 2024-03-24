package com.javarush.task.task15.task1522;

import sun.awt.windows.ThemeReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String key= reader.readLine();
        if(Objects.equals(key, Planet.EARTH)){
            thePlanet=Earth.getInstance();
        }
        else if(Objects.equals(key, Planet.SUN)){
            thePlanet=Sun.getInstance();
        }
        else if(Planet.MOON.equals(key)){
            thePlanet=Moon.getInstance();
        }
        else{
            thePlanet=null;
        }
    }
}
