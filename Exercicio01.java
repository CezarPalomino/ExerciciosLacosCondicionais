package br.com.generation.condicionalexercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero, maiorNumero = 0;
		
		for(int numeroi = 1; numeroi <= 3; numeroi++) {
			
			System.out.println("Digite o " + numeroi +"� n�mero inteiro: ");
			numero = read.nextInt();
			
			if(numero > numeroi) {
				maiorNumero = numero;
		}
	}
		System.out.println("O maior n�mero �: " + maiorNumero);
		read.close();
  }
}
