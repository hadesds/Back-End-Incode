package fundamentos.Semana2.atvWhile;

import javax.swing.*;
import java.util.Scanner;

public class whileSolicitar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = JOptionPane.showInputDialog("Informe um número:");
        int num = Integer.parseInt(valor);
        int contador = 0;

        while (contador < num) {
            contador ++;
            System.out.println(contador);
        }
    }
}
