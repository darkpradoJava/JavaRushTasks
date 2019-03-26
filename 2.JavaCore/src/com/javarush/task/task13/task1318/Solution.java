package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            InputStream file = new FileInputStream(fileName);

            while (file.available() > 0) {
                int data = file.read();
                System.out.print((char)data);
            }

            reader.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}