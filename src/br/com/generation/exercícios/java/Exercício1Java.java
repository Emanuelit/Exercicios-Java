package br.com.generation.exercícios.java;

import java.util.Scanner;

public class Exercício1Java {
	/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.
*/
	public static void main(String[] args) {
		
		int anos, meses, dias, res1, res2, res3, res4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite quantos anos você tem:\n");
		anos = leia.nextInt();
		
		System.out.println("\nDigite quantos meses:");
		meses = leia.nextInt();
		
		System.out.println("\nDigite quantos dias:");
		dias = leia.nextInt();
		
		res1 = anos * 365;
		res2 = meses * 30;
		res3 = res1 + res2;
		res4 = res3 + dias;
		
		
		System.out.println("Sua idade em dias é: " + res4);
		
		

		leia.close();
	}

}
