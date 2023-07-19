package com.gmail.olgasevel108;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int weight;
		int height;
		System.out.println("input weight");
		weight = sc.nextInt();
		System.out.println("input height");
		height = sc.nextInt();
		for (int i=0; i<height; i++) {
			for (int k=0; k<weight; k++) {
				if (i==0 || i==height-1 || k==0|| k==weight-1) {
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
				
			}
			System.out.println("");
		}
	}

}
