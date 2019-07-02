package com.java.practice;

public class PrimFibo {
	static int n = 15;
	static int i;
	static int first = 0, second = 1, count = 0, res;
	
	public static void main(String[] args) {
		
		for (i = 2; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Prime Series"+i + " ");
			}
		}
		
		while (count < 5) {
			first = first + second;
			second = first - second;
			res = first + second;
			System.out.print("Fibonacci Series : "+res+" ");
			count++;
		}
		
	

	}

}