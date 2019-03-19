package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        for (int i = 0; i < string.length(); i++) {
            if (isVowel(string.charAt(i))) {
                System.out.print(string.charAt(i) + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < string.length(); i++) {
            if (!isVowel(string.charAt(i))  && string.charAt(i) != ' ') {
                System.out.print(string.charAt(i) + " ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}