package fundamentos;

import java.sql.SQLOutput;

public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 2.3;
        String s = "Bom dia X";

        s = s.replace("X",  "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!");
        System.out.println(s);

        System.out.println("Rafa".toUpperCase());

        String y = "Boa noite X"
                .replace("X", "Gui")
                .toLowerCase()
                .concat("!!!");
        System.out.println(y);
    }
}
