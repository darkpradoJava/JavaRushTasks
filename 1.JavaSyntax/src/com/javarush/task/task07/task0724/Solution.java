package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFather1 = new Human("Dmitriy", true, 70);
        Human grandFather2 = new Human("Dmitriy", true, 70);
        Human grandMother1 = new Human("Elena", false, 65);
        Human grandMother2 = new Human("Natalia", false, 65);
        Human father = new Human("Stanislv", true, 40, grandFather1, grandMother1);
        Human mother = new Human("Elena", false, 45, grandFather2, grandMother2);
        Human son1 = new Human("Artem", true, 20, father, mother);
        Human son2 = new Human("Sergey", true, 21, father, mother);
        Human douter = new Human("Karina", false, 19, father, mother);

        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(douter);

    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}