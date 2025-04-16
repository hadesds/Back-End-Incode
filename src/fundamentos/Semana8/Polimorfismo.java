package fundamentos.Semana8;

public class Polimorfismo {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Ave a = new Ave();
        Reptil r = new Reptil();
        Peixe p = new Peixe();

        m.locomover();
        a.emitirSom();
        p.soltarBolha();
    }
}

