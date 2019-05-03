package com.srmicro.annotations;

public class Lab731 {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "AAA");
		System.out.println(e1);
	}
}

class Employee {
	int eid;
	String ename;

	Employee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return eid + "\t" + ename;
	}
}