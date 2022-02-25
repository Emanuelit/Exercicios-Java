package br.com.generation.exercícios.java;

import java.util.Scanner;

public class ExercícioJava5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double n1,n2,n3, media;
		
		System.out.println("Escreva sua primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println("Escreva sua segunda nota: ");
		n2 = leia.nextDouble();
		System.out.println("Escreva sua terceira nota: ");
		n3 = leia.nextDouble();
		
		media = (n1 * 2+n2 * 3+n3 * 5) / 10;
				
		System.out.println("O media das 3 notas é:" + media);
		
		leia.close();
	}

}
