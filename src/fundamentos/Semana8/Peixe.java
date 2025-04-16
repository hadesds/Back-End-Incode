package fundamentos.Semana8;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void alimentar() {
        System.out.println("Comendo susbtâncias");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
}
