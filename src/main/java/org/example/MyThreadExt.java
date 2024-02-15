package org.example;

public class MyThreadExt extends Thread{
    public MyThreadExt(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + " " + i + " Hello Word - Extend");
//            System.out.println("Extend " + getState());
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
