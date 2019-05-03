package com.srmicro.programmingskills;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st and 2nd number:");
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println("Before Swap:" + x + "\t" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swap:" + x + "\t" + y);
	}
}
