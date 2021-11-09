package br.com.generation.condicionalexercicios;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1, num2, num3;
		int primMaiorNum = 0, segMaiorNum = 0, menorNum = 0;
		
		System.out.println("Digite o 1º número: ");
		num1 = read.nextInt();
		
		System.out.println("Digite o 2º número: ");
		num2 = read.nextInt();
		
		System.out.println("Digite o 3º número: ");
		num3 = read.nextInt();
		
		
		if(num1 > num2 && num1 > num3) {
			primMaiorNum = num1;
		}
		if(num2 > num1 && num2 > num3) {
			primMaiorNum = num2;
		}
		if(num3 > num1 && num3 > num2) {
			primMaiorNum = num3;
		}
		
		// -----------------------------------------
		
		if(num1 > num2 && num1 < num3) {
			menorNum = num3;
		}
		else if(num2 > num1) {
			segMaiorNum = num2;
			primMaiorNum = num1;
		}
		else{
			segMaiorNum = num2;
		}
		
		// -----------------------------------------
		
		if(num1 < num2 && num1 < num3) {
			menorNum = num1;
		}
		else if(num2 < num1 && num2 < num3) {
			menorNum = num2;
		}
		else{
			menorNum = num3;
		}

		
		System.out.println("O 1º maior número é: " + primMaiorNum);
		System.out.println("O 2º maior número é: " + segMaiorNum);
		System.out.println("O 3º maior número é: " + menorNum);
		
		read.close();
	}
}
