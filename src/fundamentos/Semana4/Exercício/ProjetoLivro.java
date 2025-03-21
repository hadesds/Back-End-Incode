package fundamentos.Semana4.Exercício;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Rafael", 19, "M");
        p[1] = new Pessoa("Haz", 21, "F");

        l[0] = new Livro("Lizia Adriane", p[0], 365, "Aprendendo Redação");
        l[1] = new Livro("Daniel Caesar", p[1], 200, "Freudian");
        l[2] = new Livro("Sonder", p[1], 365, "Brent Faiyaz");

        l[0].abrir();
        l[0].folhear(57);
        System.out.println(l[0].detalhes());
    }
}
