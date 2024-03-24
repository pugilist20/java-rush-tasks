package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    String getDescription(){
        return super.getDescription()+String.format(" Моя страна - Belarus. Я несу %d яиц в месяц.", getCountOfEggsPerMonth());
    }
}
