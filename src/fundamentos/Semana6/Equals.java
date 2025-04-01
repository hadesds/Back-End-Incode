package fundamentos.Semana6;

public class Equals     {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Rafael Silva";
        u1.email = "rafael.silva@ezemail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Rafael Silva";
        u2.email = "rafael.silva@ezemail.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}
