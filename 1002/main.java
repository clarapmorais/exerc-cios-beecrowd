//1002 - Área do Círculo
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double raio = input.nextDouble(); 
        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2); //também daria certo fazer raio * raio 

        System.out.printf("A=%.4f%n", area);


        input.close();

    }
}
