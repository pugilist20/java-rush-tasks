package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 9;
    }

    String getDescription(){
        return super.getDescription()+String.format(" Моя страна - Ukraine. Я несу %d яиц в месяц.", getCountOfEggsPerMonth());
    }
}
