package com.javarush.task.task02.task0207;

/* 
Кусочек калькулятора
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 12, b = 9;
        System.out.println(sum(a, b));
        System.out.println(mult(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }
}
