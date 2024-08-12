import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Digite um número inteiro: ");
        x = sc.nextInt();
        //System.out.println("Número digitado: " + x);

        if (x < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }
}
