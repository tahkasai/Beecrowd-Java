import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        
        Scanner media1 = new Scanner(System.in); 
        
        double X, Y, media;
        
        X = media1.nextDouble();
        Y = media1.nextDouble();

        media = ((X*3.5)+(Y*7.5))/11.0;
        
        System.out.printf("MEDIA = %.5f%n", media );

    }
}