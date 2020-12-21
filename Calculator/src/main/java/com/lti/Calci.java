package com.lti;

public class Calci {

	public static int add(int n1, int n2) {
		return n1+n2;
	}
	public static int subs(int n1, int n2) {
		return n1-n2;
	}
	public static int div(int n1, int n2) {
		return n1/n2;
	}
	public static void main(String[] args) {
		System.out.println("Sum= "+add(10,20));
		System.out.println("Difference= "+subs(90,10));
		System.out.println("division= "+div(100,10));
	}

}
