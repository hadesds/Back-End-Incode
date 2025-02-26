package fundamentos.Semana2.doWhile;

import java.util.Scanner;

public class doWhileRepeticao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Integer valor = 0;

        do {
            System.out.println("Quantas vezes quer repetir: ");
            valor = entrada.nextInt();
        } while (valor != 0);
        entrada.close();
    }
}
