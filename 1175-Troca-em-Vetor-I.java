import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criando um novo scanner pra entraada de dados
        Scanner dados = new Scanner(System.in);
        int[] vetor = new int[20]; //declarando o vetor como int

        // loop para puxar 20 números para o vetor
        for (int i = 0; i < 20; i++) {
            int num = dados.nextInt();
            vetor[i] = num;
        }

        // declara i e f como inteiro, e começa pela ultima posição
        int i = 0, f = vetor.length - 1;

        // loop para trocar de posição os vetores
        while (i < f) {
            int troca = vetor[i];
            vetor[i] = vetor[f];
            vetor[f] = troca;
            i++;
            f--; 
        }

        // loop pra mostrar o resultado
        for (i = 0; i < vetor.length; i++) { 
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
    }

}