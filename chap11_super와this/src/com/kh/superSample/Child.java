package com.kh.superSample;

public class Child extends Parent{
	
	public Child() {
		super();
		System.out.println("자식 클래스의 기본 생성자입니다");
	}
	
	public Child(String name) {
		super(name);
		System.out.println("자식 클래스의 문자열 파라미터 생성자입니다.");
	}
	
	public void display() {
		super.show();
		System.out.println("자식 클래스의 display 매서드입니다.");
	}

}
