package com;

public class Bank {
	static int p =1000;
	static int t =2;
	
	static void Interest(float r ) {
		float si=(p * t * r)/100;
		System.out.println("Simple Interest"+si);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
