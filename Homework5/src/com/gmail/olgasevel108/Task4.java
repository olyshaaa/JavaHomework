package com.gmail.olgasevel108;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text;
		int counter=0;
		System.out.println("print the text");
		text = sc.nextLine();
		char [] charArray = text.toCharArray();
		System.out.println(Arrays.toString(charArray));
		for (int i=0; i<charArray.length; i++) {
			if (charArray[i] == 'b'){
				counter +=1;
			}else {
				continue;
			}
		}
		System.out.println("sum of b: " + counter);
	
	}

}
