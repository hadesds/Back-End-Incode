package fundamentos.Semana3.atvFor;

import java.util.Scanner;

public class imprimirSequencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite: ");
        int n = entrada.nextInt();

        for (int contagem = 1; contagem <= n; contagem += 2) {
            System.out.println(contagem);
        }
    }
}
