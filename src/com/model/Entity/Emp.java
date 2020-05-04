package com.model.Entity;

public class Emp {
	int Empno;
	String Empnm;
	public Emp(int empno, String empnm) {
		super();
		Empno = empno;
		Empnm = empnm;
	}
	public void display()
	{
		System.out.println(Empno+"     "+Empnm);
	}
}
