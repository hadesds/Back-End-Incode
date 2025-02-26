package fundamentos.Semana2.operadores;

public class operadoresAtribuicao {
    public static void main(String[] args) {
        //Incremento
        int saldo = 500;
        saldo += 50;
        System.out.println(saldo);

        //Atribuição de multiplicação
        double preco = 150.0;
        preco *= 0.10;
        System.out.println("Você recebeu R$" + preco + " de desconto.");
    }
}
