package fundamentos.Semana2.ifElse;

import java.util.Scanner;

public class verificacaoNota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = entrada.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else if (nota < 5) {
            System.out.println("Reprovado");
        }
    }
}
