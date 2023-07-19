package com.gmail.olgasevel108;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 10, 8, 11, 5};
		int number = 5;
		System.out.println(indexOf(arr, 6));
		System.out.println(indexOf(arr, number));
	}
	static int indexOf(int [] array, int number) {
		int index = -1;
		for (int i=0; i<array.length; i++) {
			if (array[i]==number) {
				index = i;
			}
		}
		return index;
	}
}
