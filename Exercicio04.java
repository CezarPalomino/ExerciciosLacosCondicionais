package br.com.generation.condicionalexercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero1, resultado;

		System.out.println("Digite um n�mero: ");
		numero1 = read.nextInt();

		resultado = numero1 % 2;

		if(resultado == 0){
			System.out.println("O n�mero � par!");
		}
		else{
			System.out.println("O n�mero � �mpar");
		}
		if(numero1 > 0){
		System.out.println("\nO n�mero � positivo!");
	}
		else if(numero1 < 0){
		System.out.println("\nO n�mero � negativo!");
	}
		else{
		System.out.println("\nO n�mero � zero");
	}
	read.close();
  }
}
