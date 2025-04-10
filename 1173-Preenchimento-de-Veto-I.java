import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);
        int[] vetor = new int[10];

        int num = dados.nextInt();

        vetor[0] = num;

        for (int i = 1; i < 10; i++) {
            num *= 2;
            vetor[i] = num;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }

    }
}