package com.gmail.olgasevel108;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = rectangle(5, 4);
		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	static char [][] rectangle (int height, int width) {
		char [][] arr = new char [height][width];
		for (int i=0; i<height; i++) {
			for (int j=0; j<width; j++) {
				arr[i][j] = '*';
			}
		}
		return arr;
	}
}
