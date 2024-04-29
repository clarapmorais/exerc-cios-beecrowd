//1001 - Extremamente Básico
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int x = a + b;
        System.out.println("X = " + x);
        
        input.close();
    }
}