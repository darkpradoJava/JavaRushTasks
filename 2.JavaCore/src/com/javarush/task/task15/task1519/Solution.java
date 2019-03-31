package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = reader.readLine();
            if (str.equals("exit")) {
                break;
            }

            if (str.contains(".")) {
                try {
                    Double n = Double.parseDouble(str);
                    print(n);
                } catch (Exception ignored) {
                    print(str);
                }
            } else {
                try {
                    int m = Integer.parseInt(str);
                    if (m > 0 && m < 128) {
                        print((short)m);
                    } else {
                        print(m);
                    }
                } catch (Exception ignored) {
                    print(str);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
