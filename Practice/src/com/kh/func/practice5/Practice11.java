package com.kh.func.practice5;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numArray = new int[10];
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.print("정수 " + (i + 1) + "번을 입력하세요: ");
			int num = sc.nextInt();
			
			numArray[i] = num;
			
		}
		for(int j = 0; j < numArray.length; j++) {
			System.out.print(numArray[j]);
			if(j < numArray.length - 1) {
				System.out.print(", ");
			}
		}
	}

}
