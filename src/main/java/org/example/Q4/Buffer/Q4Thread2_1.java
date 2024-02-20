package org.example.Q4.Buffer;

public class Q4Thread2_1 implements Runnable {

    StringBuffer sb;


    public Q4Thread2_1(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            for (int j = 97; j < 123; j++) {  //a : 97   z:122

                sb.append((char) j);

            }
        }

    }
}
