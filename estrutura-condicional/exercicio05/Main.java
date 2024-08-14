import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Digite o código do item: ");
        x = sc.nextInt();

        if (x == 1) {
            System.out.printf("Total: R$ %.2f %n", (x*4.00));
        }
        sc.close();
    }
}
