package com.abstraction;

abstract class cal {
	
	
	public void raju() {
		
		System.out.println("My name is raju");
	}
    abstract void rani();
}

class Advcal extends cal {
	public void rani() {
		
		System.out.println("My name is rani");
	}
}

public class calculator{
	public static void main(String[] args) {
	
	Advcal obj = new Advcal();
	obj.rani();
	
	
}
}
