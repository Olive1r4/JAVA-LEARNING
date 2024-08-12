import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Digite um número inteiro: ");
        x = sc.nextInt();
        System.out.print("Digite um número inteiro: ");
        y = sc.nextInt();

        if (x>=y) {
            if (x%y==0) {
                System.out.println("São Multiplos!");
                System.out.println();
            }
            else {
                System.out.println("Não são Multiplos!");
                System.out.println();
            }
        }
        else {
            if (y%x==0) {
                System.out.println("São Multiplos!");
                System.out.println();
            }
            else {
                System.out.println("Não são Multiplos!");
                System.out.println();
            }
        }

        sc.close();
    }
}
