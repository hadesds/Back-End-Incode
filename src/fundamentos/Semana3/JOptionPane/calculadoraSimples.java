package fundamentos.Semana3.JOptionPane;

import javax.swing.*;

public class calculadoraSimples {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(null,
                "Digite seu primeiro valor: ");
        String operacao = JOptionPane.showInputDialog(null,
                "Digite o operador:\n + | - | * | /");
        String valor2 = JOptionPane.showInputDialog(null,
                "Digite seu segundo valor: ");

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        if (operacao.equals("x")) {
            JOptionPane.showMessageDialog(null,
                    "A soma é: " + (num1 + num2));
        } else if (operacao.equals("-")) {
            JOptionPane.showMessageDialog(null,
                    "A subtração é: " + (num1 - num2));
        } else if (operacao.equals("*")) {
            JOptionPane.showMessageDialog(null,
                    "A multiplicação é: " + (num1 * num2));
        } else if (operacao.equals("/")) {
            JOptionPane.showMessageDialog(null,
                    "A divisão é: " + (num1 / num2));
        }
    }
}
