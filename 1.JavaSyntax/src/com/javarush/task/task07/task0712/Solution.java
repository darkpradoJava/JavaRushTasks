package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int minSize = list.get(0).length();
        int maxSize = list.get(0).length();

        for (String s : list) {
            if (s.length() < minSize) {
                minSize = s.length();
            }
            if (s.length() > maxSize) {
                maxSize = s.length();
            }
        }

        for (String s : list) {
            if (s.length() == minSize || s.length() == maxSize) {
                System.out.println(s);
                break;
            }
        }
    }
}
