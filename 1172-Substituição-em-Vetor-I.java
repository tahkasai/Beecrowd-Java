// 1172 Substituição em Vetor I
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scan = new Scanner(System.in);
        int num = 0;

        for(int i=0;i<10;i++){
            num = scan.nextInt();
            if(num<=0){
                num = 1;
            }
            vetor[i] = num;
        }

        for(int j=0;j<vetor.length;j++){
            System.out.println("X["+j+"] = "+vetor[j]);
        }
    }
}
