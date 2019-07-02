package com.java.practice;

public class FibonacciPrime {

	public static void main(String[] args) {
		boolean prime = true;
		int first = 0, second = 1, count = 0;
		while (count <= 10) {
			first = first + second;
			second = first - second;
			int no = first + second;

			if ((no == 0) || (no == 1)) {

			} else {
				for (int div = 2; div <= (no / 2); div++) {
					if (no % 2 == 0) {
						prime = false;
						break;
					}
				}
				if (prime == true) {
					System.out.println("Prime Numbers are in Fiboncci series "+no);
				}
			}

		}

	}
}
