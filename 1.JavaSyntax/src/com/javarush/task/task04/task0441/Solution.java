package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && b == c) {
            System.out.println(a);
        } else if (a == b) {
            System.out.println(a);
        } else if (b == c) {
            System.out.println(b);
        } else if (c == a) {
            System.out.println(c);
        } else {
            if (a > b) {
                if (b > c) {
                    System.out.println(b);
                } else {
                    if (a > c) {
                        System.out.println(c);
                    } else {
                        System.out.println(a);
                    }
                }
            } else {
                if (a > c) {
                    System.out.println(a);
                } else {
                    if (b > c) {
                        System.out.println(c);
                    } else {
                        System.out.println(b);
                    }
                }
            }
        }
    }
}
