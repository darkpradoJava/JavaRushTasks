package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        minimum = arr[0];
        maximum = arr[0];
        for (int n : arr) {
            if (n > maximum) {
                maximum = n;
            }
            if (n < minimum) {
                minimum = n;
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
