package com.kh.hw.run.Run;

import java.util.Scanner;

class printScore {
	public static void run() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("이름: ");
		String name = scanner.nextLine();

		System.out.print("학년: ");
		int grade = scanner.nextInt();

		System.out.print("반: ");
		int classNumber = scanner.nextInt();

		System.out.print("번: ");
		int studentNumber = scanner.nextInt();

		scanner.nextLine(); // 개행 문자 제거

		System.out.print("성별(M/F): ");
		char gender = scanner.nextLine().charAt(0);

		System.out.print("성적: ");
		double score = scanner.nextDouble();

		String gradeLetter;
		if (score >= 90) {
			gradeLetter = "A학점";
		} else if (score >= 80) {
			gradeLetter = "B학점";
		} else if (score >= 70) {
			gradeLetter = "C학점";
		} else if (score >= 60) {
			gradeLetter = "D학점";
		} else {
			gradeLetter = "F학점";
		}

		System.out.println(grade + "학년 " + classNumber + "반 " + studentNumber + "번 " + (gender == 'M' ? "남학생" : "여학생")
				+ " " + name + "의 점수는 " + score + "이고 " + gradeLetter + "입니다.");
	}

}
