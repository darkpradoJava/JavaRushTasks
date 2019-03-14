package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = 0, result = 0, count = 0;
        boolean calc = true;

        while (calc) {
            n = Integer.parseInt(reader.readLine());
            if (n == -1) {
                break;
            }
            result += n;
            count++;
        }

        System.out.println((double) result / count);
    }
}

