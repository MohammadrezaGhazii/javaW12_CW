package org.example;

public class MyThreadExt extends Thread{
    public MyThreadExt(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello Word - Extend");
    }
}
