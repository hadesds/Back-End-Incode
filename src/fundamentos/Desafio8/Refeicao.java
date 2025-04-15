package fundamentos.Desafio8;

import javax.management.StringValueExp;
import javax.print.DocFlavor;
import javax.swing.text.StringContent;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Refeicao extends Alimentos {
    enum diasDaSemana {
        Segunda, Terça, Quarta, Quinta, Sexta
    }

    enum turnoDaSemana {
        Matutino, Noturno
    }

    ArrayList<String> cardapioSemanal = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    public void montarRefeicao() {
        for (int dia = 0; dia < 5; dia++) {
            for (int turno = 0; turno < 2; turno++) {
                System.out.println("--- Dia: " + diasDaSemana.values()[dia] + "---");
                System.out.println("--- Turno: " + turnoDaSemana.values()[turno] + "---");

                int escolhaSalada;
                while (true) {
                    saladas.forEach((k, v) -> System.out.println(k + " - " + v));
                    System.out.print("Escolha sua salada: ");
                    String input = entrada.next();
                    try {
                        escolhaSalada = Integer.parseInt(input);
                        if (saladas.containsKey(escolhaSalada)) break;
                        else System.out.println("Opção inválida! Tente novamente.");
                    } catch (NumberFormatException e) {
                        System.out.println("Opção inválida! Tente novamente.");
                    }
                }
                String saladaEscolhida = saladas.get(escolhaSalada);

                int escolhaPratoPrincipal;
                while (true) {
                    pratos.forEach((k,v) -> System.out.println(k + " - " + v) );
                    System.out.println("Escolha seu prato principal: ");
                    String input2 = entrada.next();
                    try {
                        escolhaPratoPrincipal = Integer.parseInt(input2);
                        if (pratos.containsKey(escolhaPratoPrincipal)) break;
                        else System.out.println("Opção inválida. Tente Novamente.");
                    } catch (NumberFormatException e) {
                        System.out.println("Opção inválida. Tente Novamente.");
                    }
                }
                String pratoEscolhido = pratos.get(escolhaPratoPrincipal);

                int escolhaAcompanhamento;
                while (true) {
                    pratos.forEach((k,v) -> System.out.println(k + " - "+ v));
                    System.out.println("Escolha seu acompanhamento: ");
                    String input3 = entrada.next();
                    try {
                        escolhaAcompanhamento = Integer.parseInt(input3);
                        if (acompanhamentos.containsKey(escolhaAcompanhamento)) break;
                        else System.out.println("Opçãio inválida! Tente Novamente.");
                    } catch (NumberFormatException e) {
                        System.out.println("Opção inválida! Tente Novamente.");
                    }
                }
                String acompanhamentoEscolhido = acompanhamentos.get(escolhaAcompanhamento);

                String refeicao = diasDaSemana.values()[dia] + "[" + turnoDaSemana.values()[turno] + "]" + " | Salada: " + saladaEscolhida +
                        "| Prato: " + pratoEscolhido +
                        "| Acompanhamento: " + acompanhamentoEscolhido;
                cardapioSemanal.add(refeicao);
                System.out.println("\nRefeição adicionada com sucesso!\n");
            }
        }
    }

    public void mostrarMenu() {
        System.out.println("------ CARDAPIO SEMANAL -----");
        for (String dia : cardapioSemanal) {
            System.out.println("-----------------------");
            System.out.println(dia);
        }

    }
}


