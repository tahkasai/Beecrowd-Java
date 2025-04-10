import java.util.Scanner;

import javax.swing.plaf.synth.SynthLabelUI;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);

        int num = Scanner.nextInt();
        int salario1 = Scanner.nextInt();
        float salario2 = Scanner.nextFloat();

        float salario = salario2 * salario1;

        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f%n",salario);

    }
}
