package com.constructor;

public class ConstructorConcept {
	//class var/ instance var/ global var
	
	String name;
	int age;
	
	
	public ConstructorConcept() {
		
		System.out.println("arindam");
	}
	
	//constructor can be overloaded
	public ConstructorConcept(int i) {
		System.out.println(i);
		
	}
	/*
	 * public ConstructorConcept(String x, int y) {
	 * 
	 * name= x ; age= y; }
	 */
	
	public ConstructorConcept(String name, int age) {
		 
		//this keyword is used when we have to initialize class variables wrt to local var
		this.name= name;
		this.age=age;
		
		 }
	
public static void main(String[] args) {
	ConstructorConcept obj= new ConstructorConcept();
	ConstructorConcept obj1= new ConstructorConcept(5);
	ConstructorConcept obj2= new ConstructorConcept("amit",5);
	
	
	
	
	
}
	
	

}
