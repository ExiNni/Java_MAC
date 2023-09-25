package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {

		Cat newCat = new Cat("야옹이");
		newCat.eat();
		newCat.run();
		
		Dog newDog = new Dog("멍멍이");
		newDog.eat();
		newDog.run();
		newDog.sleep();
		
	}

}
