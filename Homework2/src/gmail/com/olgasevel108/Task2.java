package gmail.com.olgasevel108;

public class Task2 {

	public static void main(String[] args) {
		// calculate the area of a triangle
		double a = 0.4;
		double b = 0.3;
		double c = 0.5;
		double p = (1.0/2)*(a+b+c);
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println(p);
		System.out.println(s);
	}

}
