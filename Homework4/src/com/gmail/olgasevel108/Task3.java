package com.gmail.olgasevel108;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("print num");
		num = sc.nextInt();
		for (int i=1; i<=10; i++) {
			System.out.println(i + " * " + num + " = " + i*num);
		}
	}

}
