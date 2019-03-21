package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < abcArray.length; i++) {
            map.put(abcArray[i], 0);
        }

        for(String str : list) {
            for (int i = 0; i < str.length(); i++) {
                try {
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                } catch (Exception e) {

                }
            }
        }

        for (int i = 0; i < abcArray.length; i++) {
            System.out.println(abcArray[i] + " " + map.get(abcArray[i]));
        }
    }

}
