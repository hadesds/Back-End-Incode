package fundamentos.Semana6;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdAlunos = entrada.nextInt();

        System.out.println("Quantas notas por alunos? ");
        int qtdNotas = entrada.nextInt();

        double[][] notasTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for(int a = 0; a<notasTurma.length; a++) {
            for (int n = 0; n < notasTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n, a);
                notasTurma[a][n] = entrada.nextDouble();
                total+=notasTurma[a][n];
            }
        }
        double media = total / (qtdNotas * qtdAlunos);
        System.out.println("Média da turma é " + media);

        for (double[] notasDoALuno: notasTurma) {
            System.out.println(Arrays.toString(notasDoALuno));

        }
        entrada.close();
    }
}
