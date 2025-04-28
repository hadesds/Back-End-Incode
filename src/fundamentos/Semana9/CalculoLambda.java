package fundamentos.Semana9;

import java.util.function.BinaryOperator;

public class CalculoLambda {
    public static void main(String[] args) {

        Calculo calculo = (x, y) -> { return x + y; };
        System.out.println(calculo.executar(9, 8));

        calculo = (x,y) -> x*y;
        System.out.println(calculo.executar(2,3));


        //Usando interface que recebe dois parametros do mesmo tipo e retorna um resultado de mesmo tipo
        BinaryOperator<Double> calc = (x,y) -> { return x + y; };
        System.out.println(calc.apply(8.0,9.0));

    }
}
