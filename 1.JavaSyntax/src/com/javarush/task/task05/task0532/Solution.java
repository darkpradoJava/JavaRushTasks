package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        if (maximum > 0) {
            int[]arr = new int[maximum];
            for (int i = 0; i < maximum; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            Arrays.sort(arr);
            maximum = arr[arr.length - 1];
        } else {
            maximum = 0;
        }

        System.out.println(maximum);
    }
}
