
//Importar função Locale paratrocar a (,) por (.) na função Double
import java.util.Locale;
//Importar função scanner
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Importa função para trocar a (,) por (.) na função Double
		Locale.setDefault(Locale.US);

		//abrir o scanner
		Scanner sc = new Scanner(System.in);
		
		//Entrada de String
		String x;
		System.out.print("Digite uma String: ");
		x = sc.next();
		System.out.println("Entrada de String: " + x);
		System.out.println();
		
		//Entrada de Int
		int y;
		System.out.print("Digite um número inteiro: ");
		y = sc.nextInt();
		System.out.println("Entrada de Int: " + y);
		System.out.println();

		//Entrada de Double
		double z;
		System.out.print("Digite um Double: ");
		z = sc.nextDouble();
		System.out.printf("Entrada de Double: %.2f%n", z);
		System.out.println();

		//Entrada de Char
		char c;
		System.out.print("Digite um Char: ");
		c = sc.next().charAt(0);
		System.out.println("Entrada de Char: " + c);
		
		//fechar o scanner
		sc.close();
	}

}
