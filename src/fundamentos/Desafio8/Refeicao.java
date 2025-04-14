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

    ArrayList<String> cardapioSemanal = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    public void montarRefeicao() {
        for (int dia = 0; dia < 5; dia++) {
            System.out.println("--- Dia " + diasDaSemana.values()[dia] + "---");

            System.out.println("Escolha sua salada: ");
            saladas.forEach((k, v) -> System.out.println(k + " - " + v));
            int escolhaSalada = entrada.nextInt();
            String saladaEscolhida = saladas.get(escolhaSalada);

            System.out.println("Escolha sua Prato Principal: ");
            pratos.forEach((k, v) -> System.out.println(k + " - " + v));
            int escolhaPrato = entrada.nextInt();
            String pratoEscolhido = pratos.get(escolhaPrato);

            System.out.println("Escolha sua Acompanhamentos: ");
            acompanhamentos.forEach((k, v) -> System.out.println(k + " - " + v));
            int escolhaAcompanhamento = entrada.nextInt();
            String acompanhamentoEscolhido = acompanhamentos.get(escolhaSalada);

            String refeicao = diasDaSemana.values()[dia] + " | Salada: " + saladaEscolhida +
                    "| Prato: " + pratoEscolhido +
                    "| Acompanhamento: " + acompanhamentoEscolhido;
            cardapioSemanal.add(refeicao);
            System.out.println("\nRefeição adicionada com sucesso!\n");
        }
    }
    public void mostrarMenu() {
        System.out.println("------ CARDAPIO SEMANAL -----");
        for(String dia:cardapioSemanal){
            System.out.println(dia);
        }
    }

}


