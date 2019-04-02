package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
                Thread current = Thread.currentThread();
                while (!current.isInterrupted()) {
                    while (numSeconds >= 0) {
                        if (numSeconds == 0) {
                            System.out.print("Марш!");
                            numSeconds--;
                        } else {
                            System.out.print(numSeconds-- + " ");
                            Thread.sleep(1000);
                        }
                    }
                }
            } catch (InterruptedException e) {
                System.out.print("Прервано!");
            }
        }
    }
}
