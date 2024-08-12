
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
		
		//Entrada peça  1
		int codigo1;
		System.out.print("Digite o código da primeira peça: ");
		codigo1 = sc.nextInt();
		System.out.println("Código digitado: " + codigo1);
		System.out.println();
		
		int qtd1;
		System.out.print("Digite a quantidade de peças: ");
		qtd1 = sc.nextInt();
		System.out.println("Quantidade digitada: " + qtd1);
		System.out.println();

		double valor1;
		System.out.print("Digite o valor unitário da peça: ");
		valor1 = sc.nextDouble();
		System.out.printf("Valor digitado: %.2f%n", valor1);
		System.out.println();

        // Entrada peça 2
        int codigo2;
		System.out.print("Digite o código da segunda peça: ");
		codigo2 = sc.nextInt();
		System.out.println("Código digitado: " + codigo2);
		System.out.println();
		
		int qtd2;
		System.out.print("Digite a quantidade de peças: ");
		qtd2 = sc.nextInt();
		System.out.println("Quantidade digitada: " + qtd2);
		System.out.println();

		double valor2;
		System.out.print("Digite o valor unitário da peça: ");
		valor2 = sc.nextDouble();
		System.out.printf("Valor digitado: %.2f%n", valor2);
		System.out.println();

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", (qtd1*valor1)+(qtd2*valor2));
        
		//fechar o scanner
		sc.close();
	}
}