package com.kh.func.practice5;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		if (num > 0) {
			int[] array = new int[num];
			for (int i = 0; i < num; i++) {
				array[i] = i + 1;
				System.out.println("array[" + i + "] = " + array[i]);
			}

		} else {
			System.out.println("양의 정수를 입력하세요: ");
		}
		
		
	}

}
