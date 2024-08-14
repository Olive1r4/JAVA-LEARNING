import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;
        System.out.print("Digite um valor para X: ");
        x = sc.nextDouble();
        System.out.print("Digite um valor para Y: ");
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {
            System.err.println("Q4");
        }
        sc.close();
    }
}