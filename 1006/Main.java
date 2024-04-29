//1006 - Média ponderada 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double media = ((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10.0;
        System.out.printf("MEDIA = %.1f%n", media);
        
        
            input.close();

    }
}