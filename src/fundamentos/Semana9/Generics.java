package fundamentos.Semana9;

public class Generics {

//Curingas (Wildcards):
//<?> → qualquer tipo
//<? extends T> → T ou subclasse
//<? super T> → T ou superclasse



    public static class Caixa<T> {

        private T conteudo;
        // T é um parametro de tipo, ele e substituido pelo tipo de verdade na hora do seu uso

        public void guardar(T item) {
            this.conteudo = item;
        }

        public T abrir() {
            return conteudo;
        }

    }

    public static void main(String[] args) {
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.guardar((String) "Tambaqui");
        System.out.println(caixaDeTexto.abrir());

        Caixa<Integer> caixaDeNumero = new Caixa<>();
        caixaDeNumero.guardar(123);
        System.out.println(caixaDeNumero.abrir());

        Pessoa p = new Pessoa("Lucas", 19);
        Caixa<Pessoa> caixaPessoa = new Caixa<>();
        caixaPessoa.guardar(p);
        System.out.println(caixaPessoa.abrir());

    }
}
