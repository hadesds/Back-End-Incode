package fundamentos.Semana3.JOptionPane;

import javax.swing.*;

public class verificarPar {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(null,
                "Digite um valor: ");

        int v1 = Integer.parseInt(valor);

        if (v1 % 2 == 0) {
            JOptionPane.showMessageDialog(null,
                    "Seu valor é par");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Seu valor é ímpar.");
        }
    }
}
