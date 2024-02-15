package org.example.Q2;

public class MyThread2 implements Runnable {
    String announce;
    Thread thread;

    public MyThread2(String announce, String name) {
        this.announce = announce;
        thread = new Thread(this,name);
    }

    @Override
    public void run() {
        System.out.println(announce);
    }
}
