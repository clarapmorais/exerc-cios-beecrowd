package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int tempo = ler.nextInt();
		int km = ler.nextInt();
		
		double total = (km /12.0) * tempo;
		
		System.out.printf("%.3f%n",total);
		ler.close();
	}

}