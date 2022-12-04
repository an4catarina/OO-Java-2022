package udemy;
import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		int Hi, Hf, H;
		
		Scanner entrada = new Scanner(System.in);
		Hi = entrada.nextInt();
		Hf = entrada.nextInt();
		
		if (Hi < Hf) {
			H = Hf - Hi;
		} else {
			H = 24 - Hi + Hf;
		}

		System.out.println("O JOGO DUROU " + H + " HORA (S)");
		entrada.close();
	}
}
