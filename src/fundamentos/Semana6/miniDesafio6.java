package fundamentos.Semana6;

import java.util.*;

public class miniDesafio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        String[] disciplinas = {"Matemática", "Português", "História"};
        Map<Integer, String> cadastro = new HashMap<>();
        Map<Integer, double[]> notas = new HashMap<>();

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

                if (cadastro.containsKey(matricula)) {
                    System.out.println("Não foi possível completar o cadastro. Tente novamente");
                } else {
                    cadastro.put(matricula, nome);
                    double[] notasAluno = new double[disciplinas.length];
                    notas.put(matricula, notasAluno);
                    System.out.println("Cadastro realizado com sucesso!");
                }
            } else if (opcao == 2) {
                System.out.println("Listando alunos...");
                for (Map.Entry<Integer, String> alunos : cadastro.entrySet()) {
                    Integer matricula = alunos.getKey();
                    String nome = alunos.getValue();
                    System.out.println("Aluno: " + nome + " | Matrícula: " + matricula + " cadastrado com sucesso");
                }
            } else if (opcao == 3) {
                System.out.println("Listando notas...");
                for (Map.Entry<Integer, double[]> resultado : notas.entrySet()) {
                    Integer matricula = resultado.getKey();
                    String nome = cadastro.get(matricula);
                    double[] notasAluno = resultado.getValue();

                    System.out.println("Aluno: " + nome + " | Matrícula: " + matricula);
                    for (int i = 0; i < disciplinas.length; i++) {
                        System.out.println(disciplinas[i] + ": " + notasAluno[i]);
                    }
                }
            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}

