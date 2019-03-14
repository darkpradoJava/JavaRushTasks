package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("положительное четное число");
            } else {
                System.out.println("положительное нечетное число");
            }
        } else if (num < 0) {
            if (num % 2 == 0) {
                System.out.println("отрицательное четное число");
            } else {
                System.out.println("отрицательное нечетное число");
            }
        } else {
            System.out.println("ноль");
        }
    }
}
