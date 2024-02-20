package org.example.Q4.Buffer;

public class Q4Thread1_1 implements Runnable {

    StringBuffer sb;

    public Q4Thread1_1(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {

        for (int i = 1; i < 1000; i++) {

            sb.append(i);

        }

    }
}
