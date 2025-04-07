package fundamentos.Desafio7;

public class Funcionario {

    private String nome, cargo;
    private float salarioBase;

    public void receberBonificacao(float aumento) {
        if (this.cargo.equals("Analista")) {
            this.salarioBase += this.salarioBase * 10/100;
        } else if (this.cargo.equals("Gerente")) {
            this.salarioBase += this.salarioBase * 20/100;
        } else if (this.cargo.equals("Diretor")) {
            this.salarioBase += this.salarioBase * 30/100;
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
