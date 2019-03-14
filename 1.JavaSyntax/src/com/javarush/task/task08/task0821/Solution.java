package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Михаил");
        map.put("Сидоров", "Илья");
        map.put("Петров", "Иван");
        map.put("Бубубнов", "Иван");
        map.put("Колунов", "Иван");
        map.put("Колунов", "Станислав");
        map.put("Максимов", "Антон");
        map.put("Ильин", "Егор");
        map.put("Сибирев", "Егор");
        map.put("Харламов", "Гарик");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
