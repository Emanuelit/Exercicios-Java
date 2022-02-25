package br.com.generation.exercícios.java;

import java.util.Scanner;

public class ExercícioJava7 {

	public static void main(String[] args) {
		float a, b, c, d, ee, f, x, y;

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\n"
				+ "ax + by = c\n"
				+ "dx + ey = f");

		System.out.println("\nInforme o valor do coeficiente 'a': ");
		a = leitor.nextFloat();
		System.out.println("\nInforme o valor do coeficiente 'b': ");
		b = leitor.nextFloat();
		System.out.println("\nInforme o valor do coeficiente 'c': ");
		c = leitor.nextFloat();
		System.out.println("\nInforme o valor do coeficiente 'd': ");
		d = leitor.nextFloat();
		System.out.println("\nInforme o valor do coeficiente 'e': ");
		ee = leitor.nextFloat();
		System.out.println("\nInforme o valor do coeficiente 'f': ");
		f = leitor.nextFloat();

		x = ((c * ee) - (b * f)) / ((a * ee) - (b * d));

		y = ((a * f) - (c * d)) / ((a * ee) - (b * d));

		System.out.printf("\nx = %.2f", x);
		System.out.printf("\ny = %.2f", y);
		
		leitor.close();
		

	}

}
