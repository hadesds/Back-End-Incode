package fundamentos.Semana2.operadores;

import java.util.Scanner;

public class operadoresTernarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();

        System.out.println(idade >= 18 ?
                "Você é maior de idade" : "Você é menor de idade");
    }
}
