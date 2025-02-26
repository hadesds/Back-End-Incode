package fundamentos.Semana3.JOptionPane;

import javax.swing.*;
import java.util.Scanner;

public class boasVindas {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite nome: ");
        JOptionPane.showMessageDialog(null, "Ola " + nome);
    }
}
