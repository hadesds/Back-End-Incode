package fundamentos.Semana3.atvFor;

import java.util.Scanner;

public class tabuadaFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para cálculo de tabuada: ");

        int contador = 1;

        for (int limite = entrada.nextInt();contador <= 10; contador ++) {
            int multiplicacao = limite * contador;
            System.out.println("Tabuada de " + limite + " x " + contador + " = " + multiplicacao);
        }
        entrada.close();
    }
}
