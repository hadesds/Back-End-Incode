package fundamentos.Semana2.ifElse;

import java.util.Scanner;

public class verificacaoIdadeEstudante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tem mais de 18 anos? Responda com Sim ou Não: ");
        String idade = entrada.next();

        System.out.println("És estudante? Responda com Sim ou Não: ");
        String estudante = entrada.next();

        if ("Sim".equalsIgnoreCase(idade) && "Sim".equalsIgnoreCase(estudante)) {
            System.out.println("Tem direito a desconto");
        } else {
            System.out.println("Não tem direito a desconto");
        }
    }
}
