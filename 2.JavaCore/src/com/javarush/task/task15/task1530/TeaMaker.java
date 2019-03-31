package com.javarush.task.task15.task1530;

public class TeaMaker extends DrinkMaker {

    @Override
    void getRightCup() {
        System.out.printf("Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        System.out.printf("Насыпаем чай");
    }

    @Override
    void pour() {
        System.out.printf("Заливаем кипятком");
    }
}
