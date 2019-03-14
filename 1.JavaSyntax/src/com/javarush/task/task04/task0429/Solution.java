package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int countPositive = 0;
        int countNegative = 0;

        int[] arr = {a, b, c};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositive++;
            } else if (arr[i] != 0) {
                countNegative++;
            }
        }

        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}
