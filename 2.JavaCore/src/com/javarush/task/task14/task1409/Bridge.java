package com.javarush.task.task14.task1409;

interface Bridge {
    int getCarsCount();

    default void println(){
        System.out.println(getCarsCount());
    }
}
