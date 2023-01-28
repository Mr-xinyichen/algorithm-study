package com.noah.basis.complexity;

import java.util.concurrent.TimeUnit;

/**
 * @author noah
 */
public class ComplexityExplain {

    public static void sleep(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void proceed01(){
        long start = System.currentTimeMillis();
        for (int j = 0; j < 10; j++) {
            sleep();
        }
        System.out.println(System.currentTimeMillis()-start);
    }

    public static void  proceed02(){
        long start = System.currentTimeMillis();
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                sleep();
            }
        }
        System.out.println(System.currentTimeMillis()-start);
    }

    public static void main(String[] args) {
        proceed01();
        proceed02();
    }
}
