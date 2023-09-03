package com.kh.func.practice5;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int length = sc.nextInt();
		
		int[] array = new int[length];
		int sum = 0;
		
		for(int i = 0; i < length; i++) {
			
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: " );
			array[i] = sc.nextInt();
			sum += array[i];
				
			}
		for(int i = 0; i < length; i ++) {
			System.out.print(array[i] + ", ");
		}
		
		System.out.println();
		System.out.println("총 합: " + sum);
			
		}
		
	}


