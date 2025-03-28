package fundamentos.Semana6;

import javax.swing.*;
import java.util.*;

public class miniDesafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        String[] disciplinas = {"Matemática", "Português", "História"};
        Set<String> alunos = new HashSet<String>();
        HashMap<String, Integer> cadastro = new HashMap<>();
//        String[] alunos = {};

        while (true) {
            System.out.print("---------Menu---------\n");
            System.out.println("1. Cadastro\n2. Listar Alunos\n3. Listar notas\n4. Sair");
            System.out.println("Escolha sua opção: ");
            int opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Vamos realizar seu cadastro!\n Qual seu nome?");
                String nome = entrada.next();

                System.out.println("Qual seu número de matrícula?");
                Integer matricula = entrada2.nextInt();

                cadastro.put(nome, matricula);
                String[][] matriz = new String[alunos.hashCode()][disciplinas.length];

            } else if (opcao == 2) {
                System.out.println("Cadastrando alunos...");
                for (String key : cadastro.keySet()) {
                    System.out.println("Aluno: " + key + " | Matrícula: " + cadastro.get(key)
                            + " cadastrado com sucesso");
                }
            } else if (opcao==3) {

            }



        }
    }}

