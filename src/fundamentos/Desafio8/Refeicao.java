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

                saladas.forEach((k, v) -> System.out.println(k + " - " + v));
                System.out.println("Escolha sua salada: ");
                int escolhaSalada = entrada.nextInt();
                String saladaEscolhida = saladas.get(escolhaSalada);

                pratos.forEach((k, v) -> System.out.println(k + " - " + v));
                System.out.println("Escolha sua Prato Principal: ");
                int escolhaPrato = entrada.nextInt();
                String pratoEscolhido = pratos.get(escolhaPrato);

                acompanhamentos.forEach((k, v) -> System.out.println(k + " - " + v));
                System.out.println("Escolha sua Acompanhamentos: ");
                Integer escolhaAcompanhamento = entrada.nextInt();
                String acompanhamentoEscolhido = acompanhamentos.get(escolhaSalada);

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


