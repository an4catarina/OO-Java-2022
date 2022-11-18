package atividades_java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		System.out.println("Entre com o primeiro numero:");
		num1 = ler.nextInt();
		nums.add(num1);
		System.out.println("Entre com o segundo numero:");
		num2 = ler.nextInt();
		nums.add(num2);
		System.out.println("Entre com o terceiro numero:");
		num3 = ler.nextInt();
		nums.add(num3);
		System.out.println("Entre com o quarto numero:");
		num4 = ler.nextInt();
		nums.add(num4);
		System.out.println("Entre com o quinto numero:");
		num5 = ler.nextInt();
		nums.add(num5);
		
		int maximo = (int) Collections.max(nums);
		System.out.println(maximo);

	}

}

//Escreva um programa em java que receba cinco números inteiros e retorne o maior deles.