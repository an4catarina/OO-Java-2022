package atividades_java;
import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		int num;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o numero:");
		num = ler.nextInt();
		if(num % 2 == 0) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}

	}

}

//Escreva um programa em java que receba um número inteiro e retorne true caso o número seja par, e false caso contrário.