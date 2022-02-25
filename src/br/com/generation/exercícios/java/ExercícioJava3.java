package br.com.generation.exercícios.java;

import java.util.Scanner;


public class ExercícioJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int segundos, minutos, horas, totalSegundos, sobraMinutos;
		int sobraHoras;
		
		System.out.println("Informe otempo em segundos:");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos / 3600;
		sobraHoras =  (horas = 3600);
		minutos = (segundos % 3600) / 60;
		segundos = (sobraHoras % minutos) % 60;
		
		System.out.printf("\nHoras: %2.2f", horas);
		System.out.printf("\nMinutos: %2.2f ", minutos);
		System.out.printf("\nSegundos: %2.2f ", segundos);
		
		
		
		leia.close();
	}


	}

}
