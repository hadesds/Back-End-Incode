package fundamentos.Semana3;

import java.util.HashMap;

public class DESAFIORAPIDOLA {
    public static void main(String[] args) {
        HashMap<String,Integer> ids = new HashMap<>();

        ids.put("Pedro", 19);
        ids.put("Rafael", 18);
        System.out.println(ids);

        for(String key :ids.keySet()){
            System.out.println(key + ids.get(key));
        }
    }
}
