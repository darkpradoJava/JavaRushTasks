package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        try {
            FileInputStream file = new FileInputStream(reader.readLine());

            while (file.available() > 0) {
                int data = file.read();
                stringBuilder.append((char)data);
            }

            String res = stringBuilder.toString();
            String[] strArray = res.split(System.lineSeparator());
            int[] array = new int[strArray.length];

            for (int i = 0; i < strArray.length; i++) {
                array[i] = Integer.parseInt(strArray[i]);
            }

            Arrays.sort(array);

            for (int n : array) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }

            reader.close();
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
