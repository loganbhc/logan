package com.java.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
	int a = 153;
	int b=a;
	int total =0;
	int res1 =0;
	int total1 = 0;
	while(a>0) {
		int rev = a%10;
		total1 = (total1*10)+rev;
		total = total+(rev*rev*rev);
		a = a/10;
	}
	if(b==total1) {
	System.out.println(total1+" is prime number.");
	}else {
		System.out.println(total1+" is not a prime number.");
	}
	
	System.out.println("Armstrong number is "+total);
	while(total>0) {
		int res = total%10;
		res1 = res1+res;
		total = total/10;
	}
	System.out.println("The sum of Armstrong number is "+res1);
	}

}
