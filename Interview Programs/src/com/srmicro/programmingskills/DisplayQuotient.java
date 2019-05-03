package com.srmicro.programmingskills;

import java.util.Scanner;

public class DisplayQuotient {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers for division:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int quotient = 0;

		while (a >= b) {
			a -= b;
			quotient++;
		}
		System.out.println("Quotient:" + quotient);
	}
}
