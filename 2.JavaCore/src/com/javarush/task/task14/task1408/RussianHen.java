package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 8;
    }

    String getDescription(){
        return super.getDescription()+String.format(" Моя страна - Russia. Я несу %d яиц в месяц.", getCountOfEggsPerMonth());
    }
}
