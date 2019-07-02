package com.java.practice;

import java.util.Scanner;

public class SumofFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// enter the number.
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		sc.close();
		int total = 0;

		int i = 1;

		// calculate factorial here.
		while (i <= n) {
			int factorial = 1;
			int j = 1;

			while (j <= i) {
				factorial = factorial * j;
				j = j + 1;
			}
			// calculate sum of factorial of the number.
			total = total + factorial;
			i = i + 1;
		}
		// print the result here.
		System.out.println("Sum : " + total);
	}

}
