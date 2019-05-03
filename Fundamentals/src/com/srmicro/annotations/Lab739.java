package com.srmicro.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Lab739 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp e1 = new Emp(101, "AAA");
		System.out.println(e1);

		Emp e2 = e1.getClonedObject();
		System.out.println(e2);
		System.err.println(e1 == e2);
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface JLCCloneable {
}

@JLCCloneable
class Emp {
	int eid;
	String sname;

	Emp(int eid, String sname) {
		this.eid = eid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return eid + "\t" + sname;
	}

	public Emp getClonedObject() throws CloneNotSupportedException {
		boolean b1 = this.getClass().isAnnotationPresent(JLCCloneable.class);
		if (b1) {
			return new Emp(this.eid, this.sname);
		}
		throw new CloneNotSupportedException("Emp class not using JLCCloneable");
	}
}
