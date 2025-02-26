package fundamentos.Semana1;

//Atividade referente a Conversões de tipos

public class ConversoesTipos {
    public static void main(String[] args) {

        //double para int
        double primitivoX = 12.0;
        int castingX = (int) primitivoX;
        System.out.println("Valor primitivo double: " + primitivoX);
        System.out.println("Valor wrapper int: " + castingX);

        //String para Int
        String numeroS = "20";
        int conversao = Integer.parseInt(numeroS);
        System.out.println("Valor String: " + numeroS);
        System.out.println("Valor int: " + conversao);
    }
}
