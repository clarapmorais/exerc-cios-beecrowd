package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int valor = ler.nextInt();

		if ( valor < 1000000 && valor > 0  ) {
			System.out.println(valor);
			System.out.printf(valor / 100+" nota(s) de R$ 100,00%n");
		
			valor = (valor % 100 );
			System.out.printf(valor/50 +" nota(s) de R$ 50,00%n");
		
			valor = (valor % 50 );
			System.out.printf(valor/20 +" nota(s) de R$ 20,00%n");
		
			valor = (valor % 20);
			System.out.printf((valor /10)+" nota(s) de R$ 10,00%n");

			valor = (valor % 10);
			System.out.printf(valor/5 +" nota(s) de R$ 5,00%n");
			
			valor = (valor % 5);
			System.out.printf(valor/2 +" nota(s) de R$ 2,00%n");
			
			valor = (valor % 2);
			System.out.printf(valor/1 +" nota(s) de R$ 1,00%n");
			
		}
		ler.close();
	}

}