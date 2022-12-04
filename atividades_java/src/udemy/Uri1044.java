package udemy;

import java.util.Scanner;

public class Uri1044 {

	public static void main(String[] args) {
		int A, B;
		Scanner entrada = new Scanner(System.in);
		A = entrada.nextInt();
		B = entrada.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		entrada.close();

	}

}
