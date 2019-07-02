package com.java.practice;

public class AdditionofNumbers {

	public static void main(String[] args) {
		int no = 1234;
		int total = 0;
		
		while(no>0) {
			int res = no%10;
			total = total+res;
			no = no/10;
		}
		System.out.print(total);
	}

}
