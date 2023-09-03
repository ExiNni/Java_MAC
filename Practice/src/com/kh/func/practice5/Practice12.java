package com.kh.func.practice5;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		
		
		for(int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번 째 정수 입력: ");
			int inputNum = sc.nextInt();
			
			array[i] = inputNum;
			
			
			
		}
		int max = array[0];
		int min = array[0];
		
		for(int j = 0; j < array.length; j ++) {
			System.out.print(array[j]);
			max = Math.max(max, array[j]);
            min = Math.min(min, array[j]);
            
			if(j < array.length-1) {
				System.out.print(", ");
			}
		
		}
		System.out.println();
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
