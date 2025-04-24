package fundamentos.Semana9;

public class Metodos {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = somar(8,9);
        System.out.println(resultado);
    }
}

//tipos de metodos
//void = sem retorno -> public void imprimir() -> executa algo mas nao retorna valor
//com retorno -> public String getNome() -> retorna um valor ao ser chamado
//com parametros -> public void setNome(String b) -> usa argumentos na chamada
//static -> public  static int calcular() -> pode ser chamado ao criar um metodo
