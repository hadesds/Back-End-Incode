package fundamentos.Semana2.operadores;

import java.util.Scanner;

public class operadoresUnarios {
    public static void main(String[] args) {
        //Incremento e decremento
        int x = 10;
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x--;
        System.out.println(x);

        //Contador de login
        Scanner entrada = new Scanner(System.in);
        int tentativas = 5;
        System.out.println("Digite o login: ");
        while (tentativas > 0) {
            entrada.nextLine();
            tentativas--;
            System.out.println("Você ainda tem " + tentativas + " tentativas restando");
            System.out.println("Digite novamente o login: ");
        }
        System.out.println("Você excedeu o numero de tentaivas. Finalizando...");

    }
}
