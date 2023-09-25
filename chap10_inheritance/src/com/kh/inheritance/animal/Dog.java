package com.kh.inheritance.animal;

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName() + "이 뛰기 시작합니다.");
		
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + "은 고양이 밥을 대신 먹습니다");
	}
}
