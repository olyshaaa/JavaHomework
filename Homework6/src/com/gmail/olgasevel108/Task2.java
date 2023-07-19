package com.gmail.olgasevel108;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(text("hello", 3.14, 5));
	}
	static String text(String line, double value, int value1) {
		String output = line + value*value1;
		return output;
	}
}
