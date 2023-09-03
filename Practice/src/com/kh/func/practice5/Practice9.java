package com.kh.func.practice5;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] chickenMenu = { "후라이드", "양념", "간장", "마늘" };

		System.out.print("치킨 이름을 입력하세요: ");
		String chickenName = sc.next();

		if ("양념".equals(chickenName) || "후라이드".equals(chickenName) || 
				"간장".equals(chickenName) || "마늘".equals(chickenName)) {
			System.out.println(chickenName + " 치킨 배달 가능");
		} else {
			System.out.println(chickenName + " 치킨은 없는 메뉴입니다.");
		}

	}

}
