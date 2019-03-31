package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String url = reader.readLine();
            //обрезаю строку по знаку ?
            int del = 0;
            for (int i = 0; i < url.length(); i++) {
                if (url.charAt(i) == '?') {
                    del = i + 1;
                    break;
                }
            }
            String newUrl = url.substring(del);

            //получаю массив строк с параметрами и значениями
            String[] param = newUrl.split("&");

            //разделяю параметры и значения
            String[] key = new String[param.length];
            String[] val = new String[param.length];

            int index = 0;

            for (int i = 0; i < param.length; i++) {
                for (int j = 0; j < param[i].length(); j++) {
                    if (param[i].charAt(j) == '=') {
                        index = j;
                    }
                }
                if (index == 0) {
                    key[i] = param[i];
                    val[i] = "";
                } else {
                    key[i] = param[i].substring(0, index);
                    val[i] = param[i].substring(index + 1, param[i].length());
                    index = 0;
                }
            }

            for (String str : key) {
                System.out.print(str + " ");
            }

            System.out.println();
            //index.html?lvl=15&view&name=Amigo&obj=456

            for (int i = 0; i < key.length; i++) {
                if (key[i].equals("obj")) {
                    try {
                        alert(Double.parseDouble(val[i]));
                    } catch (NumberFormatException e) {
                        alert((String)val[i]);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
