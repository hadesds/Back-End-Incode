package fundamentos.Semana1;

import java.util.Scanner;

//Atividade referente a operadores lógicos
public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //1. Booleano para maior de idade
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        if (idade >= 18) {
            boolean maiorDeIdade = true;
            System.out.println("Você é maior de idade");
        } else {
            boolean maiorDeIdade = false;
            System.out.println("Você não é maior de idade");
        }

        //2. Declarar variavel de intervalo
        System.out.println("Digite um valor aleatório: ");
        int num = entrada.nextInt();
        boolean dentroDoIntervalo = num >= 10 && num <= 50;
        if (dentroDoIntervalo) {
            System.out.println("O valor está inserido no intervalo");
        } else {
            System.out.println("O valor não está inserido no intervalo");
        }


        Scanner segundaEntrada = new Scanner(System.in);
        //Declarar admin
        System.out.println("Insira o usuário: ");
        String usuario = segundaEntrada.nextLine();
        System.out.println();
        System.out.println("Insira a senha: ");
        String senha = segundaEntrada.nextLine();

        boolean acessoPermitido = usuario.equals("admin") && senha.equals("1234");
        if (acessoPermitido) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

        //4. Declaração de 3 variaveis
        System.out.println("Digite um numero: ");
        int num4 = segundaEntrada.nextInt();
        boolean positivo = num4 > 0;
        boolean negativo = num4 < 0;
        boolean neutro = num4 == 0;
        if (positivo) {
            System.out.println("O valor é positivo");
        } else if (negativo) {
            System.out.println("O valor é negativo");
        } else if (neutro) {
            System.out.println("O valor é igual a zero");
        }

        //5. Nota
        System.out.println("Insira sua nota: ");
        int nota = segundaEntrada.nextInt();
        boolean aprovado = nota >= 6;
        if (aprovado) {
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você foi reprovado");
        }
    }
    }