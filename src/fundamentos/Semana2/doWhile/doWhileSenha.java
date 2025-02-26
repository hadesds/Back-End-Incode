package fundamentos.Semana2.doWhile;

import java.util.Scanner;

public class doWhileSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha = "hades";
        do {
            System.out.println("Digite o login: ");
            senha = entrada.nextLine();
        } while (!senha.equalsIgnoreCase("hades"));
        entrada.close();
    }}
