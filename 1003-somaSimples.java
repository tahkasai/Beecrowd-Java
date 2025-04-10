import java.util.Scanner;

public class somaSimples {
    public static void main(String[] args) throws Exception {
        
        Scanner somasimples = new Scanner(System.in); 
        int A, B, X;

        A = somasimples.nextInt();
        B = somasimples.nextInt();

        X = A + B;

        System.out.printf("SOMA = %d\n", X);

        somasimples.close();

    }
}
