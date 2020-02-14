package com.jdc;

public class Client {
	
	public static void main(String[] args) {
		
//		Calculateable cal = new Calculator();
//		System.out.println("Result : " + cal.sum(10, 20));
//		cal.doCalculate();
//		
//		cal = new Calculateable() {
//			
//			@Override
//			public int sum(int num1, int num2) {
//				return num1 + num2;
//			}
//		};
//		
//		System.out.println("Result : " + cal.sum(100, 200));
		
//		Calculateable cal = (a, b) -> a + b;		// access method in variable
//		System.out.println("Result : " + cal.sum(20, 50));
//		cal.doCalculate();
		
		doCalculate((a, b) -> a + b);
		doCalculate1((a, b) -> a + b , 1000, 5000);
		
		doCalculate1(Client::add, 20, 40);
	}
	
	private static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	private static void doCalculate(Calculateable cal) {
		System.out.println(cal.sum(1000, 3000));
	}
	
	private static void doCalculate1(Calculateable cal, int a, int b) {
		System.out.println(cal.sum(a, b));
	}

}
