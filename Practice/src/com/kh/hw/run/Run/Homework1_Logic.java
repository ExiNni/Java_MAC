package com.kh.hw.run.Run;

import java.util.Scanner;

public class Homework1_Logic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;

		while (isTrue) {
			displayMenu();
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				Calculator.run();
				break;
			case 2:
				totalCalculator.run();
				break;
			case 3:
				printProfile.run();
				break;
			case 4:
				printScore.run();
				break;
			case 5:
				printStarNumber.run();
				break;
			case 6:
				sumRandom.run();
				break;
			case 7:
				exceptGugu.run();
				break;
			case 8:
				diceGame.run();
				break;
			case 9:
				isTrue = false;
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public static void displayMenu() {
		System.out.println("==========메뉴==========");
		System.out.println("1. 간단 계산기");
		System.out.println("2. 작은 수에서 큰 수까지 합계");
		System.out.println("3. 신상 정보 확인");
		System.out.println("4. 학생 정보 확인");
		System.out.println("5. 별과 숫자 출력");
		System.out.println("6. 난수까지의 합계");
		System.out.println("7. 구구단");
		System.out.println("8. 주사위 숫자 알아맞추기 게임");
		System.out.println("9. 프로그램 종료");
		System.out.println("=======================");
		System.out.println("");
		System.out.print("메뉴 번호: ");
	}

}
