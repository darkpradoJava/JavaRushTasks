package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> set = new HashSet<String>();

        for (int i = 0; i < 20; i++) {
            set.add("Литс" + i);
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
