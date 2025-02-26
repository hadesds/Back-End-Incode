package fundamentos.Semana1;

//Atividade de Fixação referente a Tipos Primitivos

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Declaração
        byte w = 12;
        System.out.println(w);
        short x = 144;
        System.out.println(x);
        int y = 1728;
        System.out.println(y);
        long z = 20736;
        System.out.println(z);

        float a = 12_345.55F;
        System.out.println(a);
        double b = 2_897_245_124.22;
        System.out.println(b);

        char c = 'C';
        System.out.println(c);
        boolean trabalho = false;
        System.out.println(trabalho);

        //Parte 2
        double valor1 = 1024;
        int valor2 = 20;
        System.out.println("O resultado da divisão é: " + valor1 / valor2);
    }
}
