import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        System.out.println("Digite os valores das variáveis A, B,C, D: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println();

        int r;
        r = (a*b) - (c*d);

        System.out.println("DIFERENCA = " + r);

        sc.close();

    }

}
