package fundamentos.Semana2.ifElse;

import java.util.Scanner;

public class verificacaoPositivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = entrada.nextInt();
        
        if (valor > 0) {
            System.out.println("O valor é positivo");
        } else if (valor < 0) {
            System.out.println("O valor é negativo");
        } else {
            System.out.println("O valor é 0");
        }
        entrada.close();
    }
}
