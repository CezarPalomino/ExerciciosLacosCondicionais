package br.com.generation.condicionalexercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero1, resultado;

		System.out.println("Digite um número: ");
		numero1 = read.nextInt();

		resultado = numero1 % 2;

		if(resultado == 0){
			System.out.println("O número é par!");
		}
		else{
			System.out.println("O número é ímpar");
		}
		if(numero1 > 0){
		System.out.println("\nO número é positivo!");
	}
		else if(numero1 < 0){
		System.out.println("\nO número é negativo!");
	}
		else{
		System.out.println("\nO número é zero");
	}
	read.close();
  }
}
