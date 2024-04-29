package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		double x1 = ler.nextDouble();
		double y1 = ler.nextDouble();
		double x2 = ler.nextDouble();
		double y2 = ler.nextDouble();
		
		double distancia = Math.sqrt(Math.pow(x2 -x1,2)+ Math.pow(y2 - y1, 2));
		
		
		System.out.printf("%.4f%n", distancia);
		ler.close();
	}

}