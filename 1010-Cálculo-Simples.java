import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner calculoSimples = new Scanner(System.in); 
        
        String valor1, valor2;
        double resultado;

        valor1 = calculoSimples.nextLine(); //.nextLine lê a linha inteira
        String[] valores = valor1.split(" ");

        valor2 = calculoSimples.nextLine(); 
        String[] valore = valor2.split(" ");
        
        double A1 = Double.parseDouble(valores[1]);
        double B1 = Double.parseDouble(valores[2]);

        double A2 = Double.parseDouble(valore[1]);
        double B2 = Double.parseDouble(valore[2]);

        resultado = (A1 * B1) + (A2 * B2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", resultado);

    } 
}
