package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if (this.strength > anotherCat.strength) {
            return true;
        } else if (strength == anotherCat.strength) {
            if (weight > anotherCat.weight) {
                return true;
            } else if (weight == anotherCat.weight) {
                if (age < anotherCat.age) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
