package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bigArr = new int[20];

        for (int i = 0; i < 20; i++) {
            bigArr[i] = Integer.parseInt(reader.readLine());
        }

        int[] smallArr1 = new int[10];
        int[] smallArr2 = new int[10];

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                smallArr1[i] = bigArr[i];
            } else {
                smallArr2[i - 10] = bigArr[i];
            }
        }

        for (int n : smallArr2) {
            System.out.println(n);
        }
    }
}
