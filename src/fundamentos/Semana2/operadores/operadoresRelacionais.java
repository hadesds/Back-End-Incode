package fundamentos.Semana2.operadores;

import java.util.Scanner;

public class operadoresRelacionais {
    public static void main(String[] args) {
        //Verificar se dois numeros sao iguais
        int num1 = 2;
        int num2 = 2;
        System.out.println(num1 == num2 ? "São iguais." : "São Diferentes");

        //Receber dois valores e verificar se o primeiro é maior ou igual ao segundo
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = entrada.nextInt();
        System.out.println("Comparando...");
        System.out.println(a >= b ? "Primeiro valor é maior" : "Segundo valor é maior");
        entrada.close();

        //Solicitando dois valores
        Scanner segundaEntrada = new Scanner(System.in);
        System.out.println("Digite seu priemiro valor: ");
        int primeiro = segundaEntrada.nextInt();
        System.out.println("Digite seu segundo valor: ");
        int segundo = segundaEntrada.nextInt();
        if (primeiro > segundo) {
            System.out.println(primeiro + " é maior dentre os valores");
        } else if (segundo > primeiro) {
            System.out.println(segundo + " é maior dentre os valores");
        } else {
            System.out.println("Os dois valores são iguais");
        }
        segundaEntrada.close();
    }
}
