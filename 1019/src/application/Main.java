package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int valor_digitado = ler.nextInt();
		double valor_min = 0 ;
		double valor_hr = 0;
		double valor_segundos = valor_digitado % 60;
		
		valor_min = (int)valor_digitado / 60;
		
		valor_hr = valor_digitado / 60 / 60;
		
		
		if ( valor_min > 60 ) {
			valor_min = (valor_digitado / 60) % 60;
		}
		if ( valor_hr > 60 ) {
			valor_hr = (valor_digitado /60) / 60 % 60;
		}

		
		System.out.println((int)valor_hr+":"+(int)valor_min+":"+(int)valor_segundos);

		ler.close();
	}

}