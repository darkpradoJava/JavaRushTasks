package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            int[] arr = new int[2];
            arr[2] = 3;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            ArrayList<String> list = new ArrayList<>();
            list.get(3);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = "a";
            int n = Integer.parseInt(s);
        } catch (Exception e) {
            exceptions.add(e);
        }

        exceptions.add(new ClassCastException());
        exceptions.add(new StringIndexOutOfBoundsException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new NullPointerException());
        exceptions.add(new UnsupportedOperationException());
        exceptions.add(new ArrayStoreException());

    }
}
