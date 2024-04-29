package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int x = ler.nextInt();
		double y = ler.nextDouble();
		
		double total = x / y;
		
		
		System.out.printf("%.3f", total);
		System.out.println(" km/l");
		ler.close();
	}

}