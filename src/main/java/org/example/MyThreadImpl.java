package org.example;

public class MyThreadImpl implements Runnable {
    String name = "" ;
    public MyThreadImpl(String name) {
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println("Hello Word - Implement");
    }
}
