package fundamentos.Semana3.switchBreakContinue;

import java.util.Scanner;

public class semaforoCor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite valor entre 1, 2 e 3: ");
        int semaforo = entrada.nextInt();

        switch (semaforo) {
            case 1:
                System.out.println("Vermelho");
                break;
            case 2:
                System.out.println("Amarelo");
                break;
            case 3:
                System.out.println("Verde");
                break;
            default:
                System.out.println("Opção inválida");
        }
        entrada.close();
    }
}
