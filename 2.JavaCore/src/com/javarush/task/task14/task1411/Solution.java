package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        ArrayList<String> list = new ArrayList<>();
        list.add("user");
        list.add("loser");
        list.add("coder");
        list.add("proger");
        for (; true; ) {
            String str = reader.readLine();
            if (!list.contains(str)) {
                break;
            }

            if (str.equals("user")) {
                person = new Person.User();
            }
            if (str.equals("loser")) {
                person = new Person.Loser();
            }
            if (str.equals("coder")) {
                person = new Person.Coder();
            }
            if (str.equals("proger")) {
                person = new Person.Proger();
            }

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }
        if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        }
        if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
