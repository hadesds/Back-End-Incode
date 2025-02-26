package fundamentos.Semana3.JOptionPane;

import javax.swing.*;

public class calculoMedia {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(null,
                "Digite sua primeira nota: ");
        String valor2 = JOptionPane.showInputDialog(null,
                "Digite sua segunda nota: ");
        String valor3 = JOptionPane.showInputDialog(null,
                "Digite sua terceira nota: ");

        int nota1 = Integer.parseInt(valor1);
        int nota2 = Integer.parseInt(valor2);
        int nota3 = Integer.parseInt(valor3);

        JOptionPane.showMessageDialog(null,
                "Sua média é: " +
                        (nota1 + nota2 + nota3)/3);
    }
}
