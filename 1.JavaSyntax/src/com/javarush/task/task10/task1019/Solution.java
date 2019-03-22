package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        try {
            while (true) {
                String idStr = reader.readLine();
                int id = Integer.parseInt(idStr);
                String str = reader.readLine();
                map.put(str, id);
                if (str.equals("")) break;
            }
        } catch (Exception e) {

        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getValue() + " " + e.getKey());
        }
    }
}
