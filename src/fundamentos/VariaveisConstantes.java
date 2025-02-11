package fundamentos;

public class VariaveisConstantes {
    public static void main(String[] args) {
        //Declaração de idade
        int idade = 19;
        System.out.println("A idade é: " + idade);

        //Exibir valor de pi
        double pi;
        pi = 3.14159;
        System.out.println("O valor de pi é " + pi);

        //String com nome e profissao
        String nome = "Rafael";
        String profissao = "Engenheiro Aeroespacial";

        System.out.println("Nome: " + nome + ", Profissão: " + profissao);

        //Soma, subtração e multiplicação
        int x = 60;
        int y = 12;

        double soma = x + y;
        double subtracao = x - y;
        double multiplicacao = x * y;

        System.out.println("O valores são = " + x + " e " + y);
        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("A multiplicação é: " + multiplicacao);

    }
}
