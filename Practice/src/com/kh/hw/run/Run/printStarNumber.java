package com.kh.hw.run.Run;

import java.util.Scanner;

class printStarNumber {
    public static void run() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("정수: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("양수가 아닙니다.");
        } else {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(i);
            }
        }
    }
}