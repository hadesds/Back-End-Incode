package fundamentos.Semana2.AtividadeFor;

import java.util.Scanner;

public class somaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite: ");
        int limite = entrada.nextInt();

        int soma = 0;
        for (int contador = 0; contador <= limite; contador++) {
            soma += contador;

            System.out.println("A soma é: " + soma);
        }
        entrada.close();
    }
}
