import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Digite o seu número: ");
        number = sc.nextInt();

        int horas;
        System.out.print("Digite a quantidade de horas: ");
        horas = sc.nextInt();

        double salario;
        System.out.print("Digite o valor da hora: ");
        salario = sc.nextDouble();
        System.out.println();


        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salario*horas);

        sc.close();
    }
}
