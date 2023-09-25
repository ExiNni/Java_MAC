package com.kh.inheritance.animal;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName() + "이 뛰기 시작합니다.");
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + "은 밥을 거부합니다");
	}
}
