package com.javarush.task.task14.task1420;

/* 
НОД
*/

import jdk.nashorn.internal.runtime.ECMAException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        if (num1 <= 0) throw new Exception();
        int num2 = Integer.parseInt(reader.readLine());
        if (num2 <= 0) throw new Exception();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                list.add(i);
            }
        }

        int nod = 1;

        for (int n : list) {
            if (num2 % n == 0) {
                if (n > nod) {
                    nod = n;
                }
            }
        }

        System.out.println(nod);

    }
}
