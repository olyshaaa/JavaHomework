package com.gmail.olgasevel108;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNumber(2));
		for (int i=2; i<=10; i++) {
			System.out.println(getNumber(i));
		}
	}
	public static String getNumber(int n) {
		String text = String.format("%."+n+"f", Math.PI);
		return text;
	}

}
