package com.java.practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		sc.close();
		if (num > 0) {
			for (int i = 1; i < num; i++) {
				if(num%i == 0) {
					sum = sum+i;
				}
			}
		}
		if(sum == num) {
			System.out.println(num+" is perfect number.");
		}else {
			System.out.println(num+" is not a perfect number.");
		}

	}
}
