package udemy;
import java.util.Scanner;

public class Uri1003 {

	public static void main(String[] args) {		
		int A, B, resultado;
		Scanner entrada = new Scanner(System.in);
		A = entrada.nextInt();
		B = entrada.nextInt();
		
		resultado = A + B;
		
		System.out.print("SOMA = " + resultado);
		entrada.close();

	}

}
