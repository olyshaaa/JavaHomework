package com.gmail.olgasevel108;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("print number: ");
		number = sc.nextInt();
		for (int i=1; i<=5; i++) {
			for (int k=1; k<=number; k++) {
				if (k%2==0) {
					System.out.print("+++");
				} else {
					System.out.print("***");
				}
			}System.out.println(" ");
			
		}
	}

}
