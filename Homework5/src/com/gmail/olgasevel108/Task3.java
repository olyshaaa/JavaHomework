package com.gmail.olgasevel108;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrayOne = new int [15];
		int [] arrayTwo = new int[30];
		int counter=0;
		for (int i=0; i<arrayOne.length; i++) {
			arrayOne[i] = (int)(Math.random()*10);
			arrayTwo[i] = arrayOne[i];
		}
		for (int i=15; i<arrayTwo.length; i++) {
			arrayTwo[i] = arrayTwo[counter]*2 ;
			counter ++;
		}
		System.out.println(Arrays.toString(arrayOne));
		System.out.println(Arrays.toString(arrayTwo));
	}

}
