package com.jdc;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodRefDemo {
	
	public MethodRefDemo() {
	}
	
	public MethodRefDemo(int i) {
		System.out.println(i * 2);
	}
	
	public static void main(String[] args) {
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
//		.forEach(e -> {});
//		.forEach(System.out :: println);
		.forEach(new MethodRefDemo() :: multiplyByTwo); 	//instance method ref
//		.forEach(MethodRefDemo :: twice);	//method ref
//		.forEach(MethodRefDemo :: new); 	//constructor ref
	}
	
	@SuppressWarnings("unused")
	private static void twice(int i) {
		System.out.println(i * 2);
	}
	
	private void multiplyByTwo(int i) {
		System.out.println(i * 2);
	}

}
