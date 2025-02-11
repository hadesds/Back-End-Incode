package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        double F = 86;
        double ajuste = 32;
        double divisao = 5.0/9.0;
        double celsius = (F - ajuste) * divisao;

        System.out.println(celsius);
    }
}
