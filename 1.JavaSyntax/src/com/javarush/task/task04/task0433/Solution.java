package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n = 0;
        while (n < 10) {
            int m = 0;
            while (m < 10) {
                System.out.print("S");
                m++;
            }
            n++;
            System.out.println();
        }
    }
}
