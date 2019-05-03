package com.srmicro.annotations;

import java.util.Date;

public class Lab729 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt.getDate());
		System.out.println(dt.getMonth());
		System.out.println(dt.getYear());
	}
}
