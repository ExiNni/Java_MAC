package com.kh.hw.run.Run;

import java.util.Scanner;

class printProfile {
    public static void run() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("이름: ");
        String name = scanner.nextLine();

        System.out.print("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("성별: ");
        String gender = scanner.nextLine();

        System.out.print("성격: ");
        String personality = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("성격: " + personality);
    }
}