package com.java.practice;

public class Prime {

	public static void main(String[] args) {
		boolean prime = true;
		int first=0, second = 1, count=0, no=7;
		
		if((no==0)||(no==1)) {
			
		}else {
			for(int div=2;div <=(no/2);div++) {
				if(no%div ==0) {
					prime=false;
					break;
				}
			}
		}
		if(prime==true)
		{
			System.out.println("Prime");
		}
		else {
			System.out.println("not Prime");
		}
	}

}
