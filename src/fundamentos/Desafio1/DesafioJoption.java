package Semana_4.DesafioJoption;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DesafioJoption {
    public static void main(String[] args) {

        int option = 0;
        ArrayList<String> listaTotal = new ArrayList<>();
        ArrayList<String> listaPendente = new ArrayList<>();
        Object[] itens = {"Adicionar tarefa","Listar tarefas","Listar tarefas pendentes","Listar tarefas concluidas","Concluir Tarefa","Sair"};
        ArrayList<String> listaConcluida = new ArrayList<>();
        while (option != 6){
            Object selectedValue = JOptionPane.showInputDialog(null,
                    "Escolha um item", "Opçao",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    itens, itens [0]);
            if (selectedValue == null){
                break;
            }
            String escolha = selectedValue.toString();

            if (escolha.equals("Adicionar tarefa")){
                String novaTarefa = JOptionPane.showInputDialog("Digite sua nova tarefa");
                listaTotal.add(novaTarefa);
                listaPendente.add(novaTarefa);

            } else if (escolha.equals("Listar tarefas")) {
                if (listaTotal.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma tarefa disponível.");
                } else {
                    JOptionPane.showMessageDialog(null, "Lista de tarefas:\n" + String.join("\n", listaTotal));
                }
            } else if (escolha.equals("Listar tarefas pendentes")) {
                if (listaPendente.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma tarefa pendente disponível.");
                } else {
                    JOptionPane.showMessageDialog(null, "Lista de tarefas:\n" + String.join("\n", listaPendente));
                }
            } else if (escolha.equals("Listar tarefas concluidas")) {
                if (listaConcluida.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma tarefa concluida disponível.");
                } else {
                    JOptionPane.showMessageDialog(null, "Lista de tarefas:\n" + String.join("\n", listaConcluida));
                }
            } else if (escolha.equals("Concluir Tarefa")) {
                if (listaPendente.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nenhuma tarefa para ser concluida disponível.");
                }else {
                    int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o indice da tarefa\n" + String.join("\n", listaConcluida))) - 1;
                    listaConcluida.add(listaPendente.get(i));
                    listaPendente.remove(i);
                    JOptionPane.showMessageDialog(null, "Tarefa Concluída!");
                }
            } else if (escolha.equals("Sair")) {
                JOptionPane.showMessageDialog(null, "Você encerrou o programa!");
                option = 6;
            }
        }

    }
}