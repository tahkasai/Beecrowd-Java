import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);

        int A = Scanner.nextInt();
        int B = Scanner.nextInt();
        int C = Scanner.nextInt();
        int D = Scanner.nextInt();

        int DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = "+DIFERENCA);

    }
}
