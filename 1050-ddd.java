// importe de extrutura de dados que armazenam pares chave valor
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // aqui está criando um dicionário
        Dictionary ddd = new Hashtable<>();

        // inserindo um par chave-valor
        ddd.put(61,"Brasilia");
        ddd.put(71,"Salvador");
        ddd.put(11,"Sao Paulo");
        ddd.put(21,"Rio de Janeiro");
        ddd.put(32,"Juiz de Fora");
        ddd.put(19,"Campinas");
        ddd.put(27,"Vitoria");
        ddd.put(31,"Belo Horizonte");

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        // puxando o valor
        if(ddd.get(numero) == null){
            System.out.println("DDD nao cadastrado");
        } else{
            System.out.println(ddd.get(numero));
        }

        // link de estudo: https://codegym.cc/pt/groups/posts/pt.653.como-criar-um-dicionario-em-java

    }
}
