package com.kh.classArray;

public class StudentMain {

	public static void main(String[] args) {
		
		Student[] student = new Student[3];
		
		student[0] = new Student("홍길동", 19);
		student[1] = new Student("강감찬", 29);
		student[2] = new Student("이순신", 39);
		
		System.out.println("총 학생 수: " + student.length);
		
		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i].name + ", ");
			System.out.println(student[i].age);
		}

	}
}
