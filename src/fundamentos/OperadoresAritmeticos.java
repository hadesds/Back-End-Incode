package fundamentos;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Media aritmetica de 3 valores
        System.out.println("Escreva o primeiro valor: ");
        int x = entrada.nextInt();
        System.out.println("\nEscreva o segundo valor: ");
        int y = entrada.nextInt();
        System.out.println("\nEscreva o terceiro valor: ");
        int z = entrada.nextInt();

        System.out.println("A média aritmética é = " + (x + y + z)/3);

        System.out.println("\n--------------");
        //Calculo de area com raio
        System.out.println("Dê um valor para o raio: ");
        int raio = entrada.nextInt();

        double area = Math.PI * raio * raio;
        System.out.println("A Aréa é dada por: " + area);

        System.out.println("\n--------------");
        //Verifica se é par
        System.out.println("Digite um valor de verificação: ");
        int expressao = entrada.nextInt();
        boolean result = (expressao % 2 == 0) && true;
        System.out.println("O resultado da expressão é: " + result);

        System.out.println("\n1. A expressao ' %2 == 0' verifica se o numero é par");
        System.out.println("\n2. && true: '&&' (E logico) sempre retornará o valor da 1ª expressão, já que 'true' é constante.");
        System.out.println("\n3. Entao o resultado final será 'true' se o número for par e 'false' caso contrário.");

        System.out.println("\n--------------");
        //Conversao Celsius para Fahrenheit
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A conversão de " + celsius + "ºC é: " + fahrenheit + "ºF");

        entrada.close();
    }
}
