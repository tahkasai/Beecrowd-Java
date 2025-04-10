import java.util.Scanner;

import javax.swing.plaf.synth.SynthLabelUI;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);

        int km = Scanner.nextInt();
        float l = Scanner.nextFloat();

        float kml = km / l;

        System.out.printf("%.3f km/l",kml);
        System.out.println();

    }
}
