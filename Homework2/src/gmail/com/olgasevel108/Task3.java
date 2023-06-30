package gmail.com.olgasevel108;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Print radius");
		Double r = sc.nextDouble();
		Double length = 2*Math.PI*r;
		System.out.println("radius = " + length);
	}

}
