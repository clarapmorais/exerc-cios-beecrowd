//1003 - Soma Simples
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int soma = a + b;

            System.out.println("SOMA = " + soma);
            
            input.close();
    }
}