package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов1", "Иван1");
        map.put("Иванов2", "Иван1");
        map.put("Иванов3", "Иван1");
        map.put("Иванов4", "Иван2");
        map.put("Иванов5", "Иван3");
        map.put("Иванов6", "Иван4");
        map.put("Иванов7", "Иван5");
        map.put("Иванов8", "Иван5");
        map.put("Иванов9", "Иван6");
        map.put("Иванов10", "Иван7");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
