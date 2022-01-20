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
		
		System.out.println("Enter (x3, y3) and (x4, y4) co-ordinates of line2");
		int x3 = scn.nextInt();
		int y3 = scn.nextInt();
		int x4 = scn.nextInt();
		int y4 = scn.nextInt();
		
		scn.close();
				
		Double line1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
        System.out.println("distancebetween Line-1 Co-ordinates"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+line1);
		
		Double line2 = Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));	 
		System.out.println("distancebetween Line-2 Co-ordinates"+"("+x3+","+y3+"),"+"("+x4+","+y4+")===>"+line2);
		
		if(line1.equals(line2))
			System.out.println("Both the lines Line-1 and Line-2 are Equal");
		
		else 
			System.out.println("Line-1 and Line-2 are not Equal");
	
	}

}
