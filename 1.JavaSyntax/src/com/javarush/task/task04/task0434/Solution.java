package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n = 1;
        while (n < 11) {
            int m = 1;
            while (m < 11) {
                System.out.print(n * m + " ");
                m++;
            }
            n++;
            System.out.println();
        }
    }
}
