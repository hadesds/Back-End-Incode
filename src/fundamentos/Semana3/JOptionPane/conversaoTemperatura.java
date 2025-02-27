package fundamentos.Semana3.JOptionPane;

import javax.swing.*;

public class conversaoTemperatura {
    public static void main(String[] args) {
        String temp = JOptionPane.showInputDialog(null,
                "Digite a temperatura em celsius: ");

        int celsius = Integer.parseInt(temp);

        JOptionPane.showMessageDialog(null,
                "A conversao para fahrenheit é " + (celsius * 9/5) * 32);
    }
}
