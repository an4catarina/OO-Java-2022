package udemy;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
		double valor;
		int cod, qtd;
		
		Scanner entrada = new Scanner(System.in);
		cod = entrada.nextInt();
		qtd = entrada.nextInt();
		valor = 0;
		switch(cod) {
			case 1:
				valor = 4.00 * qtd;
				break;
			case 2:
				valor = 4.50 * qtd;
				break;
			case 3:
				valor = 5.00 * qtd;
				break;
			case 4:
				valor = 2.00 * qtd;
				break;
			case 5:
				valor = 1.50 * qtd;
				break;
		}
		
		System.out.printf("Total: R$ %.2f", valor);
		entrada.close();
		
	}

}
