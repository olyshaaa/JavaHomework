package com.gmail.olgasevel108;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("password.txt");
		int [][] array = {{1, 2, 3}, {456, 8943, 3891}, {123, 781, 983}};
		String text = textFromFile(file);
		System.out.println(text);
		try(PrintWriter pw = new PrintWriter(file)) {
			
				pw.print(Arrays.deepToString(array));
				
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}
	public static String textFromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try(Scanner sc = new Scanner(file)){
			while (sc.hasNextLine()) {
				sb.append(sc.nextLine());
			}
			
			
		}catch(IOException e) {
			System.out.println(e);
		}
		return sb.toString();
	}
	
	
}
