import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Laço principal: vai ler vários números até encontrar um "0"
        while (true) {
            int num = scan.nextInt();

            if (num == 0) break;

            if (num >= 0 && num <= 100) {
                int[][] matriz = new int[num][num];

                // 'valor' começa em 1 e vai aumentando a cada camada concêntrica
                int valor = 1;

                // Cada iteração do laço representa uma "camada" da matriz
                // Exemplo: camada 0 = borda externa, camada 1 = segunda borda, etc.
                for (int camada = 0; camada < (num + 1) / 2; camada++) {
                    // Preenche a submatriz delimitada pela camada atual
                    for (int i = camada; i < num - camada; i++) {
                        for (int j = camada; j < num - camada; j++) {
                            matriz[i][j] = valor; // atribui o valor da camada
                        }
                    }
                    valor++; // quando termina uma camada, aumenta o valor para a próxima
                }

                for (int i = 0; i < num; i++) {
                    for (int j = 0; j < num; j++) {
                        if (j == num - 1) {
                            System.out.printf("%3d", matriz[i][j]);
                        } else {
                            System.out.printf("%3d ", matriz[i][j]);
                        }
                    }
                    // Quebra de linha ao final de cada linha da matriz
                    System.out.println();
                }

                System.out.println();
            }
        }

        scan.close(); 
    }
}