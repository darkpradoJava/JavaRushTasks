package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg[] zergs = new Zerg[5];
        Protoss[] protosses = new Protoss[3];
        Terran[] terrans = new Terran[4];

        for (int i = 0; i < zergs.length; i++) {
            zergs[i] = new Zerg();
            zergs[i].name = "Zerg" + i;
        }

        for (int i = 0; i < protosses.length; i++) {
            protosses[i] = new Protoss();
            protosses[i].name = "Protoss" + i;
        }

        for (int i = 0; i < terrans.length; i++) {
            terrans[i] = new Terran();
            terrans[i].name = "Terran" + i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
