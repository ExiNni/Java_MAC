package com.kh.func.practice5;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {

		String[] dayArray = { "일", "월", "화", "수", "목", "금", "토" };

		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 6 사이 숫자 입력: ");
		int day = sc.nextInt();

		if (0 <= day && 6 >= day) {

			System.out.println(dayArray[day] + "요일");

		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}
