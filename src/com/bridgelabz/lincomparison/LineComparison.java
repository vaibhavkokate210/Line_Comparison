package com.bridgelabz.lincomparison;

public class LineComparison {

	public static void main(String[] args) {
			System.out.println("Welcome to line comparison computation program");
			int x1=12,y1=14,x2=23,y2=43,x3=21,y3=32,x4=65,y4=96;
			int lineOneLength=(int) Math.sqrt((y1-x1)^2+(y2-x2)^2);
			int lineTwoLength=(int) Math.sqrt((y3-x3)^2+(y4-x4)^2); //UC1
			System.out.println(lineOneLength+"  "+lineTwoLength);
			boolean result=Integer.toString(lineOneLength).equals(Integer.toString(lineTwoLength)); //UC2
	        if(result)
	        	System.out.println("lines are equal");
	        else
	        	System.out.println("lines are not equal");
	        int compareResult = Integer.toString(lineOneLength).compareTo(Integer.toString(lineTwoLength)); //UC3
			if(compareResult==0)
				System.out.println("lines are equals");
			else if(compareResult>0)
				System.out.println("Lines 1 is greater");
			else
				System.out.println("Line 2 is greater");
	}

}
