package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 6;
    }

    String getDescription(){
        return super.getDescription()+String.format(" Моя страна - Moldova. Я несу %d яиц в месяц.", getCountOfEggsPerMonth());
    }
}
