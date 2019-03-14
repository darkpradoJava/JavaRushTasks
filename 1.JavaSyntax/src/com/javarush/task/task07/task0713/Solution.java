package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> mod3List = new ArrayList<Integer>();
        ArrayList<Integer> mod2List = new ArrayList<Integer>();
        ArrayList<Integer> otherList = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (int n : mainList) {
            if (n % 3 == 0) {
                mod3List.add(n);
            }
            if (n % 2 == 0) {
                mod2List.add(n);
            }
            if (n % 3 != 0 && n % 2 != 0) {
                otherList.add(n);
            }
        }

        printList(mod3List);
        printList(mod2List);
        printList(otherList);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int n : list) {
            System.out.println(n);
        }
    }
}
