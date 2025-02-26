package fundamentos.Semana2.atvWhile;

import javax.swing.*;
import java.util.Scanner;

public class whileSoma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = JOptionPane.showInputDialog("Informe um número:");
        int num = Integer.parseInt(valor);
        int soma = 0;
        int contador = 0;

        while (contador <= num) {
            soma += contador;
            contador++;
        }
        System.out.println("A soma de todos os números até " + num + " é " + soma);
        entrada.close();
    }
}
