import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Digite um número inteiro: ");
        x = sc.nextInt();

        if ((x%2)!=0) {
            System.out.printf("O número %d é impar! %n", x);
        }
        else {
            System.out.println("O número é par!");
        }
        sc.close();
    }
}
