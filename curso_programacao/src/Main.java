import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.3210;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("Olá Mundo!");
		
		//Delimitar quantidade de casas decimais
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		
		//Exibir o resultado decimal com ponto(.)
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
