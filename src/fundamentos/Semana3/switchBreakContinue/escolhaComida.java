package fundamentos.Semana3.switchBreakContinue;

import java.util.Scanner;

public class escolhaComida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        while (true) {
        System.out.println("Menu\n 1. Pizza\n 2. Hamburguer\n 3. Sushi\n 4. Sair");
        System.out.println("Escolha sua opção: ");
        opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Pizza.");
                    return;
                case 2:
                    System.out.println("Você escolheu Hamburguer");
                    return;
                case 3:
                    System.out.println("Você escolheu Sushi");
                    return;
                default:
                    System.out.println("Valor inválido\n Error!");
                    break;

            }
            entrada.close();
        }
    }
}
