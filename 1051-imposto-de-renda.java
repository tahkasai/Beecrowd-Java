import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double imposto = 0;

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            double resto = salario;

            if (resto > 4500.00) {
                imposto += (resto - 4500.00) * 0.28;
                resto = 4500.00;
            }
            if (resto > 3000.00) {
                imposto += (resto - 3000.00) * 0.18;
                resto = 3000.00;
            }
            if (resto > 2000.00) {
                imposto += (resto - 2000.00) * 0.08;
            }

            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
