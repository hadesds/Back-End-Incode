package fundamentos.Semana2.AtividadeFor;

import java.util.Scanner;

public class contagemProgressiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        System.out.println("Digite o valor limite: ");
        for (int limite = entrada.nextInt(); contador <= limite; contador ++) {
            System.out.println(contador);
        }
        entrada.close();
    }
}
