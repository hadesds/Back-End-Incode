package fundamentos.Desafio1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Teste {
    public static void main(String[] args) {
        while (true) {
        Object[] options = { "Adicionar", "Status", "Concluir", "Sair" };
        ArrayList<String> tarefas = new ArrayList<>();

        Object selectedValue = JOptionPane.showInputDialog(null, "Selecione:",
                "Opção",
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (selectedValue != null) {  // Verifica se o usuário não clicou em Cancelar
            if (selectedValue.equals("Adicionar")) {

                String novaTarefa = JOptionPane.showInputDialog("Digite o nome da nova tarefa:");
                if (novaTarefa != null && !novaTarefa.trim().isEmpty()) {
                    tarefas.add(novaTarefa);
                    JOptionPane.showMessageDialog(null,
                            "Tarefa '" + novaTarefa + "' adicionada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Nenhuma tarefa adicionada"); }

            } else if ((!selectedValue.equals("Status"))) {
                StringBuilder listaTarefas = new StringBuilder("Tarefas:\n");
                for (String tarefa : tarefas) {
                listaTarefas.append(tarefa).append("\n");
                }

        } else {
            JOptionPane.showMessageDialog(null,
                    "Nenhuma tarefa foi adicionada");
            }
        } else if ((selectedValue.equals("Concluir"))) {
            String tarefaConcluida = (String) JOptionPane.showInputDialog(
                    null,
                    "Selecione a tarefa para concluir:",
                    "Concluir Tarefa",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    tarefas.toArray(),
                    tarefas.get(0));

        }
        }
}}

