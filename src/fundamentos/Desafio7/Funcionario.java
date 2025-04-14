package fundamentos.Desafio7;

import java.util.HashMap;
import java.util.Map;

public class Funcionario {

    private String nome, cargo;
    private float salarioBase;
    Map<String, Float> listagem = new HashMap<>();

    public void receberBonificacao(float aumento) {
        if (this.cargo.equals("Analista")) {
            this.salarioBase += this.salarioBase * 10/100;
        } else if (this.cargo.equals("Gerente")) {
            this.salarioBase += this.salarioBase * 20/100;
        } else if (this.cargo.equals("Diretor")) {
            this.salarioBase += this.salarioBase * 30/100;
        }
    }

    public void adicionarFun() {
        System.out.println("Adicinando funcionários...");
        for (Map.Entry<String, Float> funcionarios : listagem.entrySet()) {
            System.out.println("Nome: " + getNome() + " | Cargo: " + getCargo().toUpperCase() + " | Salário Final: R$" + getSalarioBase());
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
}
