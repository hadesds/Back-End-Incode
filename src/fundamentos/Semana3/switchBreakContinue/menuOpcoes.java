package fundamentos.Semana3.switchBreakContinue;

import java.sql.SQLOutput;
import java.util.Scanner;

public class menuOpcoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int escolha;

        while (true) {
            System.out.println("Menu\n 1. Exibir acao1\n 2. Exibir acao2\n 3. Exibir acao3\n 4. Sair");
            System.out.println("Escolha a opção: ");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1: case 2: case 3:
                    System.out.println("Voce selecionou errado e retornou ao menu inicial.");
                    break;
                case 4:
                    System.out.println("Voce saiu do programa.");
                    entrada.close();
                    return;
            }
        }
    }
}
