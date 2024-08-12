import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Digite a hora inicial: ");
        x = sc.nextInt();
        System.out.print("Digite a hora final: ");
        y = sc.nextInt();

        if (x >= y) {
            System.out.println("O jogo durou "+(24-x+y)+" Horas(s)");
        }
        else {
            System.out.println("O jogo durou "+(y-x)+" Horas(s)");
        }
        sc.close();
    }
}
