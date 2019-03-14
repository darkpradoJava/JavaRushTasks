package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Stanislav", df.parse("JULY 12 1988"));
        map.put("Oleg", df.parse("JULY 22 1998"));
        map.put("Sergey", df.parse("SEPTEMBER 1 2000"));
        map.put("Ilya", df.parse("SEPTEMBER 1 2000"));
        map.put("Vitaliy", df.parse("SEPTEMBER 1 2000"));
        map.put("Egor", df.parse("SEPTEMBER 1 2000"));
        map.put("Elena", df.parse("SEPTEMBER 23 1983"));
        map.put("Ekaterina", df.parse("SEPTEMBER 1 2000"));
        map.put("Ilnaz", df.parse("SEPTEMBER 1 2000"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        HashMap<String, Date> newMap = new HashMap<String, Date>(map);
        for (Map.Entry<String, Date> pair : newMap.entrySet()) {
            if(pair.getValue().toString().matches(".*(Ju|Au).*")) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
