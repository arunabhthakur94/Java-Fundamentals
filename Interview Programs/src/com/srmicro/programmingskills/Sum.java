package com.srmicro.programmingskills;

import java.util.Scanner;

public class Sum {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to be added:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum;

		sum = Math.addExact(x, y);

		System.out.println("Sum:" + sum);
	}
}
