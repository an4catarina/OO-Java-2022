package atividades_java;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		String operacao;
		int num1, num2, result;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com a operação a ser realizada (+, - ou *):\n");
		operacao = ler.nextLine(); 
		System.out.print("Entre com o primeiro número:\n");
		num1 = ler.nextInt();
		System.out.print("Entre com o segundo número:\n");
		num2 = ler.nextInt();
		ler.close();
		
		switch(operacao) {
			case "+":
				result = num1 + num2;
				System.out.println(result);
				break;
			case "-":
				result = num1 - num2;
				System.out.println(result);
				break;
			case "*":
				result = num1 * num2;
				System.out.println(result);
				break;
			default:
				System.out.println("Operação inválida");
				break;
			}

	}

}

//Crie um programa em Java no qual o usuário deve entrar com a operação a ser realizada (soma '+', subtração '-' ou multiplicação '*') e dois números inteiros. O programa deverá utilizar o comando switch para escolher entre as operações e mostrar o resultado da operação.
//
//Saída esperada 1:
//
//Entre com a operação a ser realizada (+, - ou *):
//
//Entre com o primeiro número:
//
//Entre com o segundo número:
//
//O resultado da operação é: <RESULTADO>
//
//Saída esperada 2:
//
//Entre com a operação a ser realizada (+, - ou *):
//
//Entre com o primeiro número:
//
//Entre com o segundo número:
//
//Operação inválida
