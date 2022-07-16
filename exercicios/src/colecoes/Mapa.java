package colecoes;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        // usuarios.add não existe em map
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet()); // retorna as chaves sem ordem
        System.out.println(usuarios.values()); // retorna os valores
        System.out.println(usuarios.entrySet()); // retorna chave e valor
        System.out.println(usuarios.containsKey(20)); //booleano
        System.out.println(usuarios.containsValue("Roberto")); // booleano
        System.out.println(usuarios.get(3)); // retorna o elemento que procuramos
        System.out.println(usuarios.remove(1));
        for(int chave: usuarios.keySet()) { // percorre utilizando as chaves
            System.out.println(chave);
        }

        for(String valor: usuarios.values()) { // percore utilizando o valor
            System.out.println(valor);
        }
        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) { // percorre os dois ao mesmo tempo
            System.out.println(registro.getKey() + " ==>");
            System.out.println(registro.getValue());
        }
    }
}
