package fundamentos.Semana9;

public class CalculoTeste {
    public static void main(String[] args) {

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(4,6));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(7,9));

    }
}
