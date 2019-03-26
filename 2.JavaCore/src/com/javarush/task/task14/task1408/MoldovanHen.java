package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 290;
    }

    @Override
    String getDescription() {
        StringBuilder str = new StringBuilder();
        str.append(super.getDescription());
        str.append(" Моя страна - ");
        str.append(Country.MOLDOVA);
        str.append(". Я несу ");
        str.append(getCountOfEggsPerMonth());
        str.append(" яиц в месяц.");
        return str.toString();
    }
}
