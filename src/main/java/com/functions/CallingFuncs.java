package com.functions;

public class CallingFuncs {

	/*
	 * public static void student() {
	 * 
	 * int m=90; int p=80; int c=70; int total; total=m+p+c;
	 * 
	 * System.out.println(total);
	 * 
	 * }
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * student();
	 * 
	 * }
	 */

	
	
	
	
	
	/*
	 * public static void student(int m, int p, int c) {
	 * 
	 * 
	 * int m=90; int p=80; int c=70;
	 * 
	 * int total; total=m+p+c;
	 * 
	 * System.out.println(total);
	 * 
	 * }
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * student(9,10,11);
	 * 
	 * }
	 */
	
	
	public static int student(int m, int p, int c) {
		
		/*
		 * int m=90; int p=80; int c=70;
		 */
			int total;
			total=m+p+c;
			
			return total;
			
		}
		
		
		public static void main(String[] args) {
			
			int op= student(9,10,11);
			System.out.println(op);
			
		}

}
