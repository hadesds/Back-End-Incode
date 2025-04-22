package fundamentos.Semana9;

public class CalculoLambda {
    public static void main(String[] args) {

        Calculo calculo = (x, y) -> { return x + y; };
        System.out.println(calculo.executar(9, 8));

        calculo = (x,y) -> x*y;
        System.out.println(calculo.executar(2,3));
    }
}
