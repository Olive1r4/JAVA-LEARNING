import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Entrada de String: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Entrada de Int: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.printf("Entrada de Double: %.2f%n", z);
		
		char c;
		c = sc.next().charAt(0);
		System.out.println("Entrada de Char: " + c);
		
		sc.close();
	}

}
