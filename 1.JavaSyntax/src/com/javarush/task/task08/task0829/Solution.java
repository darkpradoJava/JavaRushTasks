package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        HashMap<String, String> towns = new HashMap<String, String>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) {
                break;
            }
            String name = reader.readLine();
            if (name.isEmpty()) {
                break;
            }
            towns.put(town, name);
        }

        String town = reader.readLine();
        System.out.println(towns.get(town));
    }
}
