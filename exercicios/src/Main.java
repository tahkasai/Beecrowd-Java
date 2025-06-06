import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        double imposto = 0;
        Scanner scanner = new Scanner(System.in);

        /* de 0 a 2000 isento
         * de 2000.01 até 3000 -> 8% sobre 10000
         * de 3000.01 até 4500 18%  -> 8% sobre 1000 + 18% sobre 2
         * acima de 4500 28%
         */

         float number = scanner.nextFloat();

         if(number == 0 && number<=2000){
            System.out.println("Isento");
         }
         else if (number == 2000.01 && number<=3000) {
            imposto = 2 * 0.08;
            System.out.println(imposto);
         }
         else if (number == 3000.01 && number<=4500) {
            imposto = (1000 * 0.08) + (2 * 0.18);
            System.out.println(imposto);

         }
         else if (number>4500) {
            imposto = (1000 * 0.08) + (1000 * 0.18) + (2 * 0.28);
            
         }

         scanner.close();
    }
}