package com.kh.hw.run.Run;

import java.util.Random;
import java.util.Scanner;

public class sumRandom {
    public static void run() {
    	int randomNum = (int) (Math.random() * 100) + 1;

        int sum = 0;
        for (int i = 1; i <= randomNum; i++) {
            sum += i;
        }

        System.out.println("1부터 " + randomNum + "까지의 합: " + sum);
    }
}