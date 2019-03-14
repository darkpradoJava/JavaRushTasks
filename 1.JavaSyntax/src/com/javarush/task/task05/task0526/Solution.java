package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Stanislav", 30, "37");
        Man man2 = new Man("Kirill", 31, "73");
        System.out.println(man1);
        System.out.println(man2);

        Woman woman1 = new Woman("Elena", 35, "37");
        Woman woman2 = new Woman("Olga", 33, "73");
        System.out.println(woman1);
        System.out.println(woman2);
    }

    //напишите тут ваш код
    public static class Man {
        String name, address;
        int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name, address;
        int age;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
