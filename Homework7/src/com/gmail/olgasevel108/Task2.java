package com.gmail.olgasevel108;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {1, 2, 3, 4, 5, 6};
		System.out.println(ArrayToString(numbers));
	}
	public static String  ArrayToString(int[] array) {
		StringBuilder output = new StringBuilder("[");
		for (int i: array) {
			output.append(i+", ");
		}
		output.append("]");
		return output.toString();
	}
}
