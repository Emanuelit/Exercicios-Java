package br.com.generation.exerc�cios.java;

import java.util.Scanner;

public class Exerc�cioJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double custo, distrib, valorFinal;
		
		System.out.println("Insira o valor de fabrica do ve�culo: ");
		custo = leia.nextDouble();
		
		distrib =custo +(custo * 0.28);
		valorFinal=distrib+(distrib*0.45);
		
		System.out.println("Esse � o custo ao consumidor: R$" + valorFinal);

		leia.close();
	}

}
