package com.nut;

public class MathBasic {
	public int multiply(int number1, int number2)
	{
		return number1*number2;
	}
	public int add(int a, int b)
	{
		return a+b;
	}
	public int subtract(int a, int b)
	{
		return a-b;
	}
	public double divide(int a, int b)
	{
		 if (b == 0) 
		 {
			  return -1.0;
			  }
	        return (double) a/b;
	}

}
