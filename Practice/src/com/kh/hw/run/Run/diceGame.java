package com.kh.hw.run.Run;

import java.util.Random;
import java.util.Scanner;

public class diceGame {
    public static void run() {
    	Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        char playAgain;
        
        do {
            int targetSum = random.nextInt(11) + 2;
            System.out.println("주사위 두 개의 합이 " + targetSum + "이 되도록 맞춰보세요!");

            boolean isCorrect = false;
            
            while (!isCorrect) {
                int dice1 = random.nextInt(6) + 1;
                int dice2 = random.nextInt(6) + 1;
                int total = dice1 + dice2;

                System.out.println("첫 번째 주사위: " + dice1);
                System.out.println("두 번째 주사위: " + dice2);

                if (total == targetSum) {
                    System.out.println("맞췄습니다!");
                    isCorrect = true;
                } else {
                    System.out.println("틀렸습니다. 다시 시도하세요.");
                }
            }
            
            System.out.print("계속 하시겠습니까? (y/n): ");
            playAgain = scanner.next().charAt(0);
        } while (playAgain == 'y' || playAgain == 'Y');
        
        System.out.println("게임을 종료합니다.");
    }
}