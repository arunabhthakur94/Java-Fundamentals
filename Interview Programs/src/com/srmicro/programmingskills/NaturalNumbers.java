package com.srmicro.programmingskills;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = sc.nextInt();
		if (x >= 1) {
			for (int i = 1; i <= x; i++)
				System.out.println(i);
		}

	}
}
