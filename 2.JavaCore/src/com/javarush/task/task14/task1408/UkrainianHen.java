package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 300;
    }

    @Override
    String getDescription() {
        StringBuilder str = new StringBuilder();
        str.append(super.getDescription());
        str.append(" Моя страна - ");
        str.append(Country.UKRAINE);
        str.append(". Я несу ");
        str.append(getCountOfEggsPerMonth());
        str.append(" яиц в месяц.");
        return str.toString();
    }
}
