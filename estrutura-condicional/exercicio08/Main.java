import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        System.out.print("Digite o valor do salário: ");
        x = sc.nextDouble();

        if (x<=2000.00) {
            System.out.println("Isento");
        }
        else if (x>=2000.01 && x<=3000.00) {
            System.out.printf("R$ %.2f%n",(x-2000.00)*0.08);
        }
        else if (x>=3000.01 && x<=4500.00) {
            System.out.printf("R$ %.2f%n",((1000.00*0.08)+(x-3000.00)*0.18));
        }
        else {
            System.out.printf("R$ %.2f%n",(1000.00*0.08)+(1500.00*0.18)+(x-4500.00)*0.28);
        }
        sc.close();
    }
}