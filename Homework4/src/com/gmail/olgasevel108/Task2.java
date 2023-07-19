package com.gmail.olgasevel108;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int factorial = 1;
		System.out.println("input n");
		n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			factorial = factorial * i;
		}
		System.out.println("factorial of n = "+ factorial);
	}

}
