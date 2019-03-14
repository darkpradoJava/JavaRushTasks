package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Михаил");
        map.put("Сидоров", "Илья");
        map.put("Петров", "Иван");
        map.put("Бубубнов", "Иван");
        map.put("Колунов", "Иван");
        map.put("Егоров", "Станислав");
        map.put("Максимов", "Антон");
        map.put("Ильин", "Егор");
        map.put("Сибирев", "Егор");
        map.put("Харламов", "Гарик");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, Integer> nameDublicate = new HashMap<String, Integer>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if(!nameDublicate.containsKey(pair.getValue())) {
                nameDublicate.put(pair.getValue(), 0);
            } else {
                nameDublicate.put(pair.getValue(), nameDublicate.get(pair.getValue()) + 1);
            }
        }
        for (Map.Entry<String, Integer> pair : nameDublicate.entrySet()) {
            if (pair.getValue() > 0) {
                removeItemFromMapByValue(map, pair.getKey());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
