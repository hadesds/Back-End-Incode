package fundamentos.Desafio8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Alimentos {
    public static HashMap<Integer, String> saladas = new HashMap<>();
    public static HashMap<Integer, String> pratos = new HashMap<>();
    public static HashMap<Integer, String> acompanhamentos = new HashMap<>();

    static {
        saladas.put(1, "Caesar");
        saladas.put(2, "de Maionese");
        saladas.put(3, "Verde");

        pratos.put(1, "Strogonoff");
        pratos.put(2, "Feijoada");
        pratos.put(3, "Tambaqui");

        acompanhamentos.put(1, "Pudi");
        acompanhamentos.put(2, "Mussyr");
        acompanhamentos.put(3, "Bolu");
    }
}
