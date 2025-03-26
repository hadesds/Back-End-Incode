package fundamentos.Semana6;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class notas {
    public static void main(String[] args) {

        String quantidade = JOptionPane.showInputDialog(null,
                "Quantas notas você quer informar: ");
        Integer dividendo = Integer.parseInt(quantidade);
        ArrayList<Double> armazenamentoNotas = new ArrayList<Double>();
        double calculo;

        for(int i = 0; i < dividendo; i++) {
            String input = JOptionPane.showInputDialog(null,
                    "Digite sua nota " + armazenamentoNotas.size());
            double conversaoNotas = Double.parseDouble(input);
            if (input == null){
                break;
            }
            armazenamentoNotas.add(conversaoNotas);
        }
        System.out.println(armazenamentoNotas);
        int escolha = JOptionPane.showConfirmDialog(null,
                "Vamos calcular sua media?", "Confirme", JOptionPane.YES_NO_OPTION);

        if (escolha == JOptionPane.YES_OPTION) {
            calculo = armazenamentoNotas.stream().mapToDouble(Double::doubleValue).sum();
            double valorFinal = calculo / dividendo;
            JOptionPane.showMessageDialog(null, "Cálculo de Média:  " + armazenamentoNotas
            + " / " + dividendo + " = " + valorFinal);

        }
    }
}
