import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double raio;
        System.out.print("Digite o valor da área: ");
        raio = sc.nextDouble();
        System.out.println();

        double area;
        area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A = %.4f %n", area);

        sc.close();


    }

}
