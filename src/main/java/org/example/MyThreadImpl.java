package org.example;

import static jdk.dynalink.NamedOperation.getName;

public class MyThreadImpl implements Runnable {
    Thread thread ;
    public MyThreadImpl(String name) {
        thread = new Thread(this,name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(thread.getName() + " " + i +" Hello Word - Implement");
//            System.out.println("Implement " + thread.getState());
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
