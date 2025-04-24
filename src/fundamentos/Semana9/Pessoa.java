package fundamentos.Semana9;

import java.util.Arrays;
import java.util.List;

public class Pessoa {
        String nome;
        int idade;

        static List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 18),
                new Pessoa("Bruno", 25),
                new Pessoa("Carlos", 17),
                new Pessoa("Diana", 30)
        );

        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() { return nome; }
        public int getIdade() { return idade; }

        @Override
        public String toString() {
            return nome + " (" + idade + " anos" + ")";
        }

        public static void mostrarMaiorIdade() {
            pessoas.stream()
                    .filter(p -> p.getIdade() >= 18)
                    .forEach(p -> System.out.println(p));
        }
        public static void listaNomes() {
            pessoas.stream()
                    .map(p -> p.getNome())
                    .forEach(nome -> System.out.println(nome));
        }

    public static void main(String[] args) {
        System.out.println("Pessoas maiores de idade: ");
        mostrarMaiorIdade();

        System.out.println("Lista de nomes: ");
        listaNomes();
    }

}



