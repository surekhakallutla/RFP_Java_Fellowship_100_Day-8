package com.bridgelabz.oopspart1;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		int WorkingHour = 0;
		int Present = 1;
		int Wage = 0;
		int WagePerHour = 20;
		
		employee();

		
		if(employee() == Present)
		{
			System.out.println("Employee is Present");
			WorkingHour = 8;
		}
		
		else
		{
			System.out.println("Employee is Absent");
			WorkingHour = 0;
		}
		
		Wage = WorkingHour * WagePerHour;
		System.out.println("Employee wage is "+ Wage);
		
	}

	public static double employee()
	{

		double empCheck = Math.floor(Math.random() * 10) % 2;
//		System.out.println("Employee check value is "+empCheck);
		return empCheck;
		
	}
}
