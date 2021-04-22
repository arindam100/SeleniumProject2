package com.interface1.impl;

import com.interface1.A1;

public class Test implements A1{
	
	public int add(int a, int b) {
		
		int sum;
		
		sum = a+b;
		return sum;
		}
	
	public static void main(String[] args) {
		
		Test obj=new Test();
		A1 obj1=new Test();
		System.out.println(obj1.add(5, 6));
		
		
		//System.out.println(obj.add(5,6));
	}
}









/*public class Test implements A1{

	int c;
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		
		return c=a+b;
	}
	
	public static void main(String[] args) {
		
		Test ts = new Test();
		//System.out.println(ts.add(5,6));
		int op =ts.add(5,6);
		System.out.println(op);
	}
	
	
	

}*/
