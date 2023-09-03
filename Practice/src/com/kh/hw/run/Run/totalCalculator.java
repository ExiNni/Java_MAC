package com.kh.hw.run.Run;

import java.util.Scanner;

class totalCalculator {
    public static void run() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수: ");
        int num2 = scanner.nextInt();

        int start = Math.min(num1, num2); 
        int end = Math.max(num1, num2);  

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println(start + "부터 " + end + "까지 정수들의 합: " + sum);
    }
}