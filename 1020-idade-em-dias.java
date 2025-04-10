import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner idadeDias = new Scanner(System.in); 
        
        int Data, Anos, Meses, Dias;

        Data = idadeDias.nextInt();
        
        Anos = Data/365;
        Meses = (Data%365)/30;
        Dias = ((Data%365)%30)%30;

        System.out.printf("%d ano(s)%n", Anos);
        System.out.printf("%d mes(es)%n", Meses);
        System.out.printf("%d dia(s)%n", Dias);
    } 
}