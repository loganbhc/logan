package com.java.practice;

public class Fibonacci {

	public static void main(String[] args) {
		int first = 0, second = 1, count = 0;
		while (count < 5) {
			first = first + second;
			second = first - second;
			System.out.print(first + second+" ");
			count++;
		}
	}

}
