package fundamentos.Semana9;

import org.w3c.dom.ls.LSOutput;

public class CalculoTeste {
    public static void main(String[] args) {

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(4,6));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(7,9));
    }
    public interface operacao {
        int executar (int a, int b);
    }
    operacao soma = (a,b) -> a + b;
}
