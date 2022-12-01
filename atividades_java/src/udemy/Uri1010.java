package udemy;

import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
		int cod1, num1, cod2, num2;
		double val1, val2, a, b, pag;
		
		Scanner entrada = new Scanner(System.in);
		cod1 = entrada.nextInt();
		num1 = entrada.nextInt();
		val1 = entrada.nextDouble();
		cod2 = entrada.nextInt();
		num2 = entrada.nextInt();
		val2 = entrada.nextDouble();
		
		a = num1 * val1;
		b = num2 * val2;
		pag = a + b;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", pag);
		entrada.close();
	}

}
