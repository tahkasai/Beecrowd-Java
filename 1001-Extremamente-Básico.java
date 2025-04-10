import java.util.Scanner;
public class ExtremamenteFacil {
    public static void main(String[] args) throws Exception {
        
        Scanner soma = new Scanner(System.in);
        
        int A, B, X;

        A = soma.nextInt();
        B = soma.nextInt();

        X = A + B;

        System.out.printf("X = %d\n", X); 
        
    }
}