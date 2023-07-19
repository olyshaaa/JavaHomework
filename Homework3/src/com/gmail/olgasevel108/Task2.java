package com.gmail.olgasevel108;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year;
		int days;
		System.out.println("print year");
		year = sc.nextInt();
		if (year%4==0 || year%400==0) {
			days = 366;
		}else {
			days = 365;
		}
		System.out.println("days: " + days);
	}

}
