package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("공부하기");
		arr.add("밥먹기");
		arr.add("씻기");
		System.out.println(arr);
		
		int size = arr.size();
		System.out.println("총 할일 : " + size);
		
		arr.remove(1);
		System.out.println("할일 제거 체크 : " + arr);
		
		arr.add("잠자기");
		System.out.println(arr);
	}
}
