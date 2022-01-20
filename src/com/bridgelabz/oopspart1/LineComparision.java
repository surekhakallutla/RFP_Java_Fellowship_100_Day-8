package com.bridgelabz.oopspart1;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args)	
	{
		System.out.println("Welcome to line Comparision Computation Program");
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter (x1, y1) and (x2, y2) co-ordinates of line1");
		int x1 = scn.nextInt();
		int y1 = scn.nextInt();
		int x2 = scn.nextInt();
		int y2 = scn.nextInt();
		scn.close();
		
		double line = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
        System.out.println("distance between Line Co-ordinates"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+line);
        
	}

}
