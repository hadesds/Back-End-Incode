package fundamentos;

//Atividade relacionada a Wrappers

public class AtividadeWrappers {
    public static void main(String[] args) {

        //Conversão explícita de integer
        Integer a = 19;
        int primitivo = a.intValue();
        System.out.println("Integer: " + a);
        System.out.println("Primitivo: " + primitivo);

        //Conversão de double para Double
        double b = 123.0;
        Double wrapperB = Double.valueOf(b);
        System.out.println("Primitivo: " + b);
        System.out.println("Wrapper (Double): " + wrapperB);
    }
}
