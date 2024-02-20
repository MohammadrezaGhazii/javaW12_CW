package org.example.Q4;

public class Q4Thread1 implements Runnable {

    StringBuilder sb;

    public Q4Thread1(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {

            sb.append(i);

        }

    }
}
