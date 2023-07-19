package com.gmail.olgasevel108;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("print a");
		a = sc.nextInt();
		System.out.println("print b");
		b = sc.nextInt();
		System.out.println("print c");
		c = sc.nextInt();
		if (a+b>=c && a+c>=b && b+c>=a) {
			System.out.println("this triangle exists");
		}else {
			System.out.println("this triangle doesn't exist");
		}
	}

}
