
//Importar função Locale paratrocar a (,) por (.) na função Double
import java.util.Locale;
//Importar função scanner
import java.util.Scanner;
//Importar função Math para calcular raiz
import java.lang.Math;

public class Main {
    
	public static void main(String[] args) {
		
		//Importa função para trocar a (,) por (.) na função Double
		Locale.setDefault(Locale.US);

		//abrir o scanner
		Scanner sc = new Scanner(System.in);
		
		//Entrada das variáveis


		double a, b, c;
		System.out.print("Digite um valor para A: ");
        a = sc.nextDouble();
        System.out.print("Digite um valor para B: ");
        b = sc.nextDouble();
        System.out.print("Digite um valor para C: ");
        c = sc.nextDouble();

        double pi = 3.14159;

		System.out.printf("TRIANGULO: %.3f%n", (a*c)/2);
        System.out.printf("CIRCULO: %.3f%n", Math.pow(c,2)*pi);
        System.out.printf("TRAPEZIO: %.3f%n", (a+b)*c/2);
        System.out.printf("TRIANGULO: %.3f%n", (b*4));
        System.out.printf("TRIANGULO: %.3f%n", (a*b));

		System.out.println();

        
		//fechar o scanner
		sc.close();
	}
}
