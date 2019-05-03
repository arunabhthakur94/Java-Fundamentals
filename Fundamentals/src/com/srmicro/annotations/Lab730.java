package com.srmicro.annotations;

public class Lab730 {
	public static void main(String[] args) {
		Student s1 = new Student("AAA");
		System.out.println(s1);

		Student s2 = new Student(101, "BBB");
		System.out.println(s2);
	}
}

class Student {
	int sid;
	String sname;

	Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	@Deprecated
	Student(String sname) {
		this.sname = sname;
	}

	public String toString() {
		return sid + "\t" + sname;
	}
}