package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int qntKm = ler.nextInt();
		
		int total = qntKm * 2;
		
		
		System.out.println(total+ " minutos");
		ler.close();
	}

}