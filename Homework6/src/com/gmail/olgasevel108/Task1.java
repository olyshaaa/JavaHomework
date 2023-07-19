package com.gmail.olgasevel108;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 10, 3, 4, 5, 8};
		System.out.println(maxValue(arr));
	}
	static int maxValue(int [] arr) {
		int max = arr[0];
		for (int i: arr) {
			if (i>max) {
				max = i;
			}
		}
		return max;
	}
}
