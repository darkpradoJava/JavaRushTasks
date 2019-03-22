package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name, adress;
        private int age, weight, height;
        private char sex;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int  age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int  age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int  age, int weight, int height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int  age, int weight, int height, char sex) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(String name, int  age, int weight, int height, char sex, String adress) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
            this.adress = adress;
        }

        public Human(String name, String adress) {
            this.name = name;
            this.adress = adress;
        }

        public Human(String name, String adress, char sex) {
            this.name = name;
            this.adress = adress;
            this.sex = sex;
        }

        public Human(String name, char sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(char sex, String adress) {
            this.sex = sex;
            this.adress = adress;
        }

    }
}
