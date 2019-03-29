package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(25.6, "Hello");
        labels.put(36.6, "Good");
        labels.put(38.6, "Bad");
        labels.put(17d, "123");
        labels.put(3.0, "III");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
