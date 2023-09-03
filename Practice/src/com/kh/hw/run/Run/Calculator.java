package com.kh.hw.run.Run;

import java.util.Scanner;

class Calculator {
    public static void run() {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("첫 번째 정수: ");
        int num1 = scanner.nextInt();
        
        System.out.print("두 번째 정수: ");
        int num2 = scanner.nextInt();
        
        System.out.print("연산자 (+, -, x, /): ");
        char operator = scanner.next().charAt(0);
        
        int result = 0;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
            case 'X':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return; 
        }
        
        System.out.println(num1+ " " + operator + " " + num2 + " = " + result);
    }
}