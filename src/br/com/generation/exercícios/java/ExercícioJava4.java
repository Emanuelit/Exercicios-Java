package br.com.generation.exercícios.java;

import java.util.Scanner;

public class ExercícioJava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float a, b, c, r, s, total;
		
		System.out.println("Informe o primeiro valor: ");
		a = leia.nextFloat();
		
		System.out.println("Informe o segundo valor: ");
		b = leia.nextFloat();
		
		System.out.println("Informe o terceiro valor: ");
		c = leia.nextFloat();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		total = (r + s) / 2;
		
		System.out.printf("total = %.2f", total);
		
		leia.close();
		

	}

}
