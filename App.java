// 1435 Matriz Quadrada I

import java.util.Scanner;
import java.math.*;

public class App {
    public static void main(String[] args) {
        // Váriaveis
        int num,metade;
        String quebra = System.lineSeparator();
        // Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Comecou");

        do{
            num = scan.nextInt();
            // Só funciona se o número for maior ou igual a zero ou menor ou igual a 100
            if(0<=num || num<=100){
                // Se for zero para o laço
                if(num == 0){
                    break;
                }
                // Definindo o comprimento da matriz
                int[][] matriz = new int[num][num];
                // Vendo o número do meio
                metade = num%2==1?(num/2):(int)Math.floor(num/2); //ceil (pra baixo) e floor(para baixo)

                //Laço para mostrar a matriz
                for(int i=0;i<matriz.length;i++){
                    for(int j=0;j<matriz[i].length;j++){
                        // Retorna sempre em um laço novo
                        int um = 1;
                        if(num==1){
                            matriz[i][j] = um;
                        }
                        // impar
                        else if(num%2==1){
                            if(i==metade & j==metade){
                                um++;
                                matriz[i][j] = um;
                            }else{
                                matriz[i][j] = um;
                            }
                        } 
                        // par
                        else{
                            if(num==2){
                                matriz[i][j]=um;
                            } 
                            else if((i==metade-1 & j==metade-1) || (i==metade & j==metade)){
                                um++;
                                matriz[i][j] = um;
                            }
                            else{
                                matriz[i][j] = um;
                            }
                        }
                        System.out.print(j==matriz[i].length-1?matriz[i][j]+quebra:matriz[i][j]+"   ");
                    }
                }


                System.out.println();
            }else{
                break;
            }
        }while(true);    
    }
}
