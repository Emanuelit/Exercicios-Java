package br.com.generation.exercícios.java;

import java.util.Scanner;

public class ExercícioJava6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double x1, x2, y1, y2, x, y, D, soma;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\n"
				+ "P(x1,y1) e P(x2, y2)");

		System.out.println("\nInforme o ponto x1: ");
		x1 = leitor.nextDouble();

		System.out.println("Informe o ponto x2: ");
		x2 = leitor.nextDouble();

		System.out.println("Informe o ponto y1: ");
		y1 = leitor.nextDouble();

		System.out.println("Informe o ponto y2: ");
		y2 = leitor.nextDouble();

		x = Math.pow(x2-x1, 2);
		y = Math.pow(y2-y1, 2);

		soma = x + y;

		D = Math.sqrt(soma);
		

		System.out.printf("\nA distância entre os pontos informados é: %.2f", D);
	
		leitor.close();
	}

}
