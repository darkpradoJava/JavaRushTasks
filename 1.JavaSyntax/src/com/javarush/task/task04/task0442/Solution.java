package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int res = 0;
        boolean calc = true;

        while (calc) {
            n = Integer.parseInt(reader.readLine());
            res += n;
            if (n == -1) {
                break;
            }
        }

        System.out.println(res);
    }
}
