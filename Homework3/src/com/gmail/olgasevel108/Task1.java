package com.gmail.olgasevel108;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int max;
		System.out.println("input a");
		a = sc.nextInt();
		System.out.println("input b");
		b = sc.nextInt();
		System.out.println("input c");
		c = sc.nextInt();
		System.out.println("input d");
		d = sc.nextInt();
		if (a>=b && a>=c && a>=d) {
			max = a;
		} else if (b>=a && b>=c && b>=d) {
			max = b;
		} else if (d>=a && d>=b && d>=c)
		{
			max = d;
		}else {
			max = c;
		}
		System.out.println("max = "+ max);
	}

}
