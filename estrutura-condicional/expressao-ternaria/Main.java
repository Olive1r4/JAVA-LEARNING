import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para X: ");
        int x = sc.nextInt();

        //Guardar a resposta em outra variavel
        String resp;
        resp = (x > 0)?"POSITIVO":"NEGATIVO";
        System.out.println(resp);
        //passar a resposta ja dentro do print
        System.out.println((x > 0)?"POSITIVO":"NEGATIVO");

        sc.close();
    }
}