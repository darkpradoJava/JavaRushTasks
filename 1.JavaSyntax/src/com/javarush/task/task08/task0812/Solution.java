package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

//        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
//
//        for (int n : list) {
//            if (!hashMap.containsKey(n)) {
//                hashMap.put(n, 1);
//            } else {
//                hashMap.put(n, hashMap.get(n) + 1);
//            }
//        }

        int count = 0;
        int newCount = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                newCount++;
            } else {
                if (list.get(i).equals(list.get(i - 1))) {
                    newCount++;
                } else {
                    if (count < newCount) {
                        count = newCount;
                        newCount = 1;
                    } else {
                        newCount = 1;
                    }
                }
            }
        }

//        for (Map.Entry<Integer, Integer> pair : hashMap.entrySet()) {
//            if (pair.getValue() > count) {
//                count = pair.getValue();
//            }
//        }

        System.out.println((count < newCount) ? newCount : count);
    }
}