import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);

        float num1 = Scanner.nextFloat();
        float num2 = Scanner.nextFloat();
        float num3 = Scanner.nextFloat();

        float media = ((num1*2) + (num2*3) + (num3*5)) / 10;
        System.out.printf("MEDIA = %.1f%n",media);

    }
}
