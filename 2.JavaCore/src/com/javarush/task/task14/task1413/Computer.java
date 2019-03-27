package com.javarush.task.task14.task1413;

public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
