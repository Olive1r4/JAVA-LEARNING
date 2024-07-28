import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Digite um valor inteiro para X: ");
        x = sc.nextInt();
        System.out.println();

        int y;
        System.out.print("Digite um valor inteiro para Y: ");
        y = sc.nextInt();
        System.out.println();

        int z;
        z = x+y;

        System.out.println("SOMA X + Y = " + z);
        System.out.println();
        sc.close();
        
    }
}
