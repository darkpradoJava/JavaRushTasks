package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Иванов", 300);
        map.put("Сидоров", 700);
        map.put("Петров", 900);
        map.put("Бубубнов", 400);
        map.put("Колунов", 500);
        map.put("Егоров", 400);
        map.put("Максимов", 1000);
        map.put("Ильин", 1100);
        map.put("Сибирев", 450);
        map.put("Харламов", 250);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copyMap = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> item : copyMap.entrySet()) {
            if (item.getValue() < 500) {
                map.remove(item.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        HashMap<String, Integer> map = createMap();
//        removeItemFromMap(map);
//        for (Map.Entry<String, Integer> p : map.entrySet()) {
//            System.out.println(p.getKey() + " - " + p.getValue());
//        }
    }
}