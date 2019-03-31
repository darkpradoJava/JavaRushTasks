package com.javarush.task.task15.task1530;

public class LatteMaker extends DrinkMaker {

    @Override
    void getRightCup() {
        System.out.printf("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.printf("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.printf("Заливаем молоком с пенкой");
    }
}
