package com.kh.func.practice5;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean isTrue = true;

		while (isTrue) {
			System.out.println("정수를 입력하세요: ");
			int num = sc.nextInt();

			int[] array = new int[num];
			int mid = num / 2;

			if (num > 2) {
				if (num % 2 == 1) {

					for (int i = 0; i < num; i++) {
						if (i <= mid) {
							array[i] = i + 1;
						} else {
							array[i] = num - i;
						}

					}
					for (int i = 0; i < num; i++) {
						System.out.print(array[i]);
						if (i < num - 1) {
							System.out.print(", ");
							isTrue = false;
						}
					}
				} else {
					System.out.println("다시 입력하세요. ");
					isTrue = true;
				}
			} else {
				System.out.println("다시 입력하세요. ");
				isTrue = true;
			}

		}

	}

}
