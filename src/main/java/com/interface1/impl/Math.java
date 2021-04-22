package com.interface1.impl;
import com.interface1.Calculator;

public class Math implements Calculator{
	
	public int add(int a, int b) {
		
	int sum;
	sum=a+b;
	return sum;
	}
	
	 
	public int minus(int a, int b)	{
	int sub;
	sub=a-b;
	return sub;
		
		
	}
	
	public int multi(int a, int b)	{
		int Mul;
		Mul=a*b;
		return Mul;
			
			
	}
	
	
public static void main(String[] args) {
	Calculator obj=new Math();
	Math obj1= new Math();
	
	//Calculator obj1=new Math();
	System.out.println(obj.add(5, 6));
	
	System.out.println(obj.minus(6, 6));
	System.out.println(obj1.multi(6, 6));
	
	
	}


}
		
	
	


