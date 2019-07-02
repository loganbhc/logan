package com.java.practice;

public class PrimeNumbers {

	public static void main(String[] args) {
		/*
		 * Check the number is prime or not for(int i=2; i<100;i++) { int count =0;
		 * for(int j=2;j<i;j++) { if(i%j == 0) { count++; } } if(count==0) {
		 * System.out.print(i+" "); } }
		 */
		int n = 1000;
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println(i+" ");
			}
		}

	}

}
