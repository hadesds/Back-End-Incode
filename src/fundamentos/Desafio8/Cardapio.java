package fundamentos.Desafio8;

import javax.swing.*;
import java.util.ArrayList;

public class Cardapio {
    public static void main(String[] args) {
        Refeicao semana = new Refeicao();
        semana.montarRefeicao();
        semana.mostrarMenu();
    }
}


