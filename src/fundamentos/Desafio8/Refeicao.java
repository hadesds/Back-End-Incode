package fundamentos.Desafio8;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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
                do {
                    saladas.forEach((k, v) -> System.out.println(k + " - " + v));
                    System.out.print("Escolha sua salada: ");
                    escolhaSalada = entrada.nextInt();
                    if (!saladas.containsKey(escolhaSalada)) {
                        System.out.println("Opção inválida! Tente novamente.");
                    }
                } while (!saladas.containsKey(escolhaSalada));
                String saladaEscolhida = saladas.get(escolhaSalada);


                int escolhaPratoPrincipal;
                do {
                    pratos.forEach((k, v) -> System.out.println(k + " - " + v));
                    System.out.print("Escolha seu prato: ");
                    escolhaPratoPrincipal = entrada.nextInt();
                    if (!pratos.containsKey(escolhaPratoPrincipal)) {
                        System.out.println("Opção inválida! Tente novamente.");
                    }
                } while (!pratos.containsKey(escolhaPratoPrincipal));
                String pratoEscolhido = pratos.get(escolhaPratoPrincipal);

                int escolhaAcompanhamento;
                do {
                    acompanhamentos.forEach((k, v) -> System.out.println(k + " - " + v));
                    System.out.print("Escolha seu acompanhamento: ");
                    escolhaAcompanhamento = entrada.nextInt();
                    if (!acompanhamentos.containsKey(escolhaAcompanhamento)) {
                        System.out.println("Opção inválida! Tente novamente.");
                    }
                } while (!acompanhamentos.containsKey(escolhaAcompanhamento));
                String acompanhamentoEscolhido = acompanhamentos.get(escolhaAcompanhamento);

                String refeicao = diasDaSemana.values()[dia] + "[" + turnoDaSemana.values()[turno] + "]" +" | Salada: " + saladaEscolhida +
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


