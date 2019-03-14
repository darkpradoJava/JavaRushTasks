package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код.
        Human child1 = new Human("Artem", true, 20, null);
        Human child2 = new Human("Karina", false, 19, null);
        Human child3 = new Human("Sergey", true, 17, null);
        Human father = new Human("Stanislav", true, 40, child1, child2, child3);
        Human mother = new Human("Elena", false, 45, child1, child2, child3);
        Human grandFather1 = new Human("Dmitiy", true, 60, father);
        Human grandFather2 = new Human("Dmitiy", true, 58, mother);
        Human grandMother1 = new Human("Elena", false, 60, father);
        Human grandMother2 = new Human("Natalia", false, 65, mother);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, Human...child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
            if (child != null) {
                this.children.addAll(Arrays.asList(child));
            }
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
