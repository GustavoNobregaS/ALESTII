import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

import java.security.MessageDigest;


class minhaClasse {
    String nome;
    int idade;
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}


public class HashDemo1 {
    public static void main(String[] args) {

        String valor = "meu nome";
        String valor2 = "meu nome ";
        System.out.println(valor.hashCode());
        System.out.println(valor2.hashCode());

        //HashMap

        HashMap<String, String> estados = new HashMap<>();
        estados.put("RS", "Rio Grande do Sul");
        estados.put("SC", "Santa Catarina");

        System.out.println(estados);
        System.out.println(estados.get("RS"));

        /*
        estados.size();
        estados.clear();
        estados.remove();
        */

        //estados.containsValue()
        //http://coding-geek.com/how-does-a-hashmap-work-in-java/

        minhaClasse m1 = new minhaClasse();
        m1.nome="Leonardo";
        m1.idade=20;

        minhaClasse m2 = new minhaClasse();
        m2.nome="Leonardo";
        m2.idade=20;

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        int hashCode1 = Objects.hash(m1);
        int hashCode2 = Objects.hash(m2);


    }
}
