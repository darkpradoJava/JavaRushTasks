package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        int countNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                countNum++;
            }
        }
        //System.out.println(countNum);
        int[] arrNum = new int[countNum];
        String[] arrStr = new String[array.length - countNum];

        for (int i = 0, j = 0, h = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                arrNum[j] = Integer.parseInt(array[i]);
                j++;
            } else {
                arrStr[h] = array[i];
                h++;
            }
        }

        //сортировка int[] по убыванию пузырьком
        int tempNum;
        for (int j = 0; j < arrNum.length; j++) {
            for (int i = 1; i < arrNum.length - j; i++) {
                if (arrNum[i - 1] < arrNum[i]) {
                    tempNum = arrNum[i - 1];
                    arrNum[i - 1] = arrNum[i];
                    arrNum[i] = tempNum;
                }
            }
        }

        //сортировка String[] по возрастанию пузырьком
        String tempStr;
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 1; j < arrStr.length - i; j++) {
                if (isGreaterThan(arrStr[j - 1], arrStr[j])) {
                    tempStr = arrStr[j - 1];
                    arrStr[j - 1] = arrStr[j];
                    arrStr[j] = tempStr;
                }
            }
        }

        String[] arrRes = new String[array.length];

        for (int i = 0, j = 0, h = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                arrRes[i] = String.valueOf(arrNum[j]);
                j++;
            } else {
                arrRes[i] = arrStr[h];
                h++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = arrRes[i];
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
