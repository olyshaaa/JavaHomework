package com.gmail.olgasevel108;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.println("print n: ");
		count = sc.nextInt();
		int [] numbers = new int[count];
		for (int i=0; i<count; i++) {
			System.err.println("print the: " + i + "element");
			numbers[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		
	}

}
