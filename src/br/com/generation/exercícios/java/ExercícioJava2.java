package br.com.generation.exercícios.java;

import java.util.Scanner;

public class ExercícioJava2 {
//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	//expressa em anos, meses e dias.
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		
		int idadeAnos, idadeDias, idadeMeses, diasVividos;
		System.out.println("Digite os dias vividos: ");
		diasVividos = leia.nextInt();
		
		idadeAnos = diasVividos / 365;
		diasVividos  = diasVividos % 365;
		idadeMeses = diasVividos / 30;
		diasVividos = diasVividos % 30;
				
		idadeDias = diasVividos;
		
		
		System.out.println("Você viveu: " + idadeAnos + "Anos," + idadeMeses + "Meses e " +idadeDias + "Dias");
//escreva("Você viveu "+anos+" ano"+", "+meses+" meses"+" e "+dias+" dias ")
		leia.close();
	}

}
