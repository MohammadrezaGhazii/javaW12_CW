package org.example.Q1;

public class Main {
    public static void main(String[] args) {
        System.out.println("main thread - 1");
        MyThreadExt myThreadExt = new MyThreadExt("Child1");
//        myThreadExt.setPriority(Thread.MAX_PRIORITY);
        myThreadExt.setDaemon(true);
        myThreadExt.start();

        System.out.println("main thread - 2");
        MyThreadImpl myThreadImpl = new MyThreadImpl("Child2") ;
        Thread thread = new Thread(myThreadImpl);
//        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();

        try {
            myThreadExt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End of program");
    }
}