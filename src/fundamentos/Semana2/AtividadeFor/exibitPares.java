package fundamentos.Semana2.AtividadeFor;

import java.util.Scanner;

public class exibitPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int pares = 0;
        System.out.println("digite um valor: ");

        for(int lim = entrada.nextInt(); pares <= lim; pares += 2){
            System.out.println(pares);
        }
    }
}
