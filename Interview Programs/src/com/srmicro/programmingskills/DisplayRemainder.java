package com.srmicro.programmingskills;

import java.util.Scanner;

public class DisplayRemainder {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int rem = a - (a / b) * b;
		System.out.println("Remainder:" + rem);
	}
}
