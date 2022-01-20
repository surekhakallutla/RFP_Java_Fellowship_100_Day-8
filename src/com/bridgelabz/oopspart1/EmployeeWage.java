package com.bridgelabz.oopspart1;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		
		int Wage = 0;
		int WorkingHour = 0;
		final int Present = 1;
		final int Part_Time = 2;
		final int WagePerHour = 20;
		final int TotalWorkingDays = 20;
		int TotalWorkingHours = 100;
		int TotalEmpWage = 0;
		int Day = 0;
		int FullDayWorkingHour = 8;
		
		
		while( Day < TotalWorkingDays && (WorkingHour + FullDayWorkingHour) <= TotalWorkingHours)
		{
			employee();
			
			Day++;
			
			switch(employee())
			{
			case Present:
				System.out.println("Employee is Present");
				WorkingHour += FullDayWorkingHour;
				break;
			case Part_Time:
				System.out.println("Employee is Part Timer");
				WorkingHour += (FullDayWorkingHour / 2);;
				break;
			default:
				System.out.println("Employee is Absent");
				WorkingHour = 0;
			}
			
			TotalWorkingHours += WorkingHour;
			System.out.println("Day:"+Day+"\tEmp Hr:"+WorkingHour);
			
			Wage = WorkingHour * WagePerHour;
			TotalEmpWage = TotalEmpWage + Wage;
			System.out.println("Employee wage is "+ Wage);
			
		}
		
		TotalEmpWage = TotalWorkingHours * WagePerHour;
		System.out.println("Total Employee Wage is "+TotalEmpWage);
	}

	public static int employee()
	{
	
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
	//	System.out.println("Employee check value is "+empCheck);
		return empCheck;
	
	}


}

