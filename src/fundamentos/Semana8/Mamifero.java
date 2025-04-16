package fundamentos.Semana8;

public class Mamifero extends Animal{
    private String corPelo;
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
