package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter file = new BufferedWriter(new FileWriter(reader.readLine()));

            while (true) {
                String str = reader.readLine();
                for (int i = 0; i < str.length(); i++) {
                    file.write((char) str.charAt(i));
                }
                file.newLine();
                if (str.equals("exit")) {
                    break;
                }
            }

            reader.close();
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
