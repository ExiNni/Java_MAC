package com.kh.func.practice5;

import java.util.Random;

public class Practice13 {

	    public static void main(String[] args) {
	        int[] array = new int[10];
	        Random rand = new Random();
	        
	        for (int i = 0; i < array.length; i++) {
	            int randomNumber;
	            boolean isDuplicate;
	            
	            do {
	                isDuplicate = false;
	                randomNumber = rand.nextInt(10) + 1; 
	                
	                for (int j = 0; j < i; j++) {
	                    if (array[j] == randomNumber) {
	                        isDuplicate = true;
	                        break;
	                    }
	                }
	            } while (isDuplicate);
	            
	            array[i] = randomNumber;
	        }

	        System.out.print("배열 값: ");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }
	}
