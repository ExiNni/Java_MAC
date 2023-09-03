package com.kh.hw.run.Run;

import java.util.Scanner;

public class exceptGugu {
    public static void run() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("정수: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println(num + "단 출력:");

            for (int i = 1; i <= 9; i++) {
                if (i % num != 0) { // 배수가 아닌 경우에만 출력
                    System.out.println(num + " * " + i + " = " + (num * i));
                }
            }
        } else {
            System.out.println("양수를 입력하세요.");
        }
    }
}
