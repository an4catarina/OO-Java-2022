package atividades_java;
import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		String carac;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o caracter a ser verificado:");
		carac = ler.nextLine();
		ler.close();
		
		if (carac.matches("[0-9]*")) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}
	}
//a
}

//Escreva um programa em java que receba um caracter e verifique se 
//se trata de um caracter numérico, ou seja, um número entre 0 e 9. Se sim, o método deve retornar true. Se não, o método deve retornar false. 