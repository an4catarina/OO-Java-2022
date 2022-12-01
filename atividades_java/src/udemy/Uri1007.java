package udemy;

import java.util.Scanner;

public class Uri1007 {

	public static void main(String[] args) {
		int A, B, C, D, DIF;
		
		Scanner entrada = new Scanner(System.in);
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		DIF = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + DIF);
		entrada.close();

	}

}
