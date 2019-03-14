package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.isLetter;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String newS = "";

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 && isLetter(s.charAt(i))) || (i != 0 && !isLetter(s.charAt(i - 1)) && isLetter(s.charAt(i))))
                newS += Character.toString(s.charAt(i)).toUpperCase();
            else
                newS += Character.toString(s.charAt(i));
        }
        s = newS;
        System.out.println(s);
    }
}
