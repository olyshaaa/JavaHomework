package com.gmail.olgasevel108;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {0, 5, 2, 4, 7, 1, 3, 19};
		int counter=0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				counter +=1;
			}else {
				continue;
			}
		}
		System.out.println("number of odd digits: " + counter);
	}

}
