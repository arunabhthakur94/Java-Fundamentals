package com.srmicro.programmingskills;

import java.util.Scanner;

public class SwapNumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st and 2nd number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before Swap:" + a + "\t" + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swap:" + a + "\t" + b);
	}
}
