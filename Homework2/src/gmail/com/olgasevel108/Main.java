package gmail.com.olgasevel108;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// the program reads a 5-digit number and displays the numbers from which it consists
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Print 5 digit number");
		int number = sc.nextInt();
		
		int a = number/10000;
		int b = number%10000/1000;
		int c = number%1000/100;
		int d = number%100/10;
		int e = number%10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
