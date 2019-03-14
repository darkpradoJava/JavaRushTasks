package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0, num;
        String sNum, end = "сумма";

        while (true) {
            sNum = reader.readLine();
            if (sNum.equals(end)) {
                break;
            }
            num = Integer.parseInt(sNum);
            result += num;
        }

        System.out.println(result);
    }
}
