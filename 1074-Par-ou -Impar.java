import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int numero;

        Scanner scanner = new Scanner(System.in);
        int vezes = scanner.nextInt();

        for (int i = 0; i < vezes; i++) {
            numero = scanner.nextInt();
            Resultado(numero);
        }

    }
    public static void Resultado(int numero) {
        if (numero == 0) {

            System.out.println("NULL");

        } else if (numero % 2 != 0){ // IMPAR -> ODD
            
            if(numero<0){ // NEGATIVO
                System.out.println("ODD NEGATIVE");
            }else{ // POSITIVO
                System.out.println("ODD POSITIVE");
            }

        } else if (numero % 2 == 0) { // PAR -> EVEN
            
            if(numero<0){// NEGATIVO
                System.out.println("EVEN NEGATIVE");
            }else{ // POSITIVO
                System.out.println("EVEN POSITIVE");
            }

        }
    }
}
