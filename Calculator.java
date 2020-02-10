package com.epam.Calculator;

public class Calculator {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int div(int a,int b) {
		try {
		return a/b;
	}
		catch(ArithmeticException e) {
			System.out.println(e);
			return -1;
		}
	}
	public static int modulus(int a,int b) {
		return a%b;
	}
}
