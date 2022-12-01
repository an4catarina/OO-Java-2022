package atividades_java;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		int num;
		int summ = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
			num = entrada.nextInt();
			if (num > 0) {
				summ += num;
			}
		} while (num > 0);
		
		System.out.println(summ);
		entrada.close();
	}
}

//Construa um programa que imprime a soma de todos os valores positivos digitados pelo usu´ario até que ele digite um número negativo.