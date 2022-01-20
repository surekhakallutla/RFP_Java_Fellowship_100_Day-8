package com.bridgelabz.oopspart1;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		empcheck();

	}

	public static void empcheck()
	{
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("empCheck"+empCheck);
		int PRESENT = 1;

		if(empCheck == PRESENT)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
