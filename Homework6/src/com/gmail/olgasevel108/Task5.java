package com.gmail.olgasevel108;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "hello world !";
		System.out.println(countOfSpace(text));
	}
	static int countOfSpace(String text) {
		int counter = 0;
		char [] array = text.toCharArray();
		for (int i: array) {
			if (i==' ') {
				counter +=1;
			}
		}
		return counter;
		 
	}
}
