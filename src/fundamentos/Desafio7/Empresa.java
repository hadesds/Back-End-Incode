package fundamentos.Desafio7;

import java.util.HashMap;
import java.util.Map;

public class Empresa {
    public static void main(String[] args) {
        Funcionario p1 = new Funcionario();
        p1.adicionarFun();
        p1.setCargo("Analista");
        p1.setNome("João");
        p1.setSalarioBase(1000.00f);
    }
}
