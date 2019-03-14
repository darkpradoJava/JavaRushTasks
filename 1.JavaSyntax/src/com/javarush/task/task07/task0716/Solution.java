package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        boolean isR = false;
        boolean isL = false;

        for (int i = 0; i < list.size(); ) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if (list.get(i).charAt(j) == 'р') {
                    isR = true;
                }
                if (list.get(i).charAt(j) == 'л') {
                    isL = true;
                }
            }
            if (isR && isL) {
                isR = false;
                isL = false;
                i++;
            } else if (isR) {
                isR = false;
                list.remove(i);
            } else if (isL) {
                isL = false;
                list.add(i, list.get(i));
                i += 2;
            } else {
                i++;
            }
        }
        return list;
    }
}