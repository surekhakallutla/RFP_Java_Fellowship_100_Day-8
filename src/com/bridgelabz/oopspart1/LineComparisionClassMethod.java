package com.bridgelabz.oopspart1;

public class LineComparisionClassMethod {
	
	public void Lineequals(Double line1, Double line2)
	{
		if(line1.equals(line2))
			System.out.println("Both the lines Line-1 and Line-2 are Equal");
		
		else 
			System.out.println("Line-1 and Line-2 are not Equal");
	}
	
	public void LinecompareTo(Double line1, Double line2)
	{
		int result = line1.compareTo(line2);
		
		if(result > 0)
			System.out.println("Line-1 is Greaterthan Line-2");
		
		else if(result < 0)
			System.out.println("Line-1 is Lesserthan Line-2");
		else 
			System.out.println("Line-1 and Line-2 are Equal");

	}
	
}
