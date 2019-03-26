package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 280;
    }

    @Override
    String getDescription() {
        StringBuilder str = new StringBuilder();
        str.append(super.getDescription());
        str.append(" Моя страна - ");
        str.append(Country.BELARUS);
        str.append(". Я несу ");
        str.append(getCountOfEggsPerMonth());
        str.append(" яиц в месяц.");
        return str.toString();
    }
}
