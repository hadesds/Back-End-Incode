package fundamentos.Semana3.switchBreakContinue;

import java.util.Scanner;

public class numerosImparesPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int inicio = 0;
        for(int num = entrada.nextInt(); inicio <= num; inicio++) {
            if (inicio % 2 == 0) {
                continue;
            }
        System.out.println(inicio);
            entrada.close();
        }
    }
}
