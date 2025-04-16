package fundamentos.Semana9;

public class CalculoTeste {
    public static void main(String[] args) {
        Calculo soma = new Somar();
        System.out.println(soma.executar(4,6));

        Calculo multiplicacao = new Multiplicar();
        System.out.println(multiplicacao.executar(7,9));

    }
}
