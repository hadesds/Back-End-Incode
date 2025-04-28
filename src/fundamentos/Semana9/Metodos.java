package fundamentos.Semana9;

public class Metodos {
    //---metodo normal----
    public static int somar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int resultado = somar(8,9);
        System.out.println(resultado);
    }

    //-----Metodo generico---
    //Permitem trabalhar com tipos genéricos dentro de métodos, mesmo sem tornar a classe genérica
    public static <T> void imprimirArray (T[] array) {
        for(T item : array) {
            System.out.println(item);
        }
        String[] nomes = {"A", "B", "C"};
        Metodos.imprimirArray(nomes);
    }
}

//tipos de metodos
//void = sem retorno -> public void imprimir() -> executa algo mas nao retorna valor
//com retorno -> public String getNome() -> retorna um valor ao ser chamado
//com parametros -> public void setNome(String b) -> usa argumentos na chamada
//static -> public  static int calcular() -> pode ser chamado ao criar um metodo
//generico -> permitem trabalhar com tipos genéricos dentro de métodos, mesmo sem tornar a classe genérica
