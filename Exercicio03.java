package br.com.generation.condicionalexercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade do nadador: ");
		idade = read.nextInt();

		if(idade >= 5 && idade <= 7){
			System.out.println("Nadador Categoria Infantil A");
		}
		else if(idade >=8 && idade <= 11){
			System.out.println("Nadador Categoria Infantil B");
		}
		else if(idade >=12 && idade <= 13){
			System.out.println("Nadador Categoria Juvenil A");
		}
		else if(idade >= 14 && idade <= 17){
			System.out.println("Nadador Categoria Juvenil B");
		}
		else if(idade >= 18){
			System.out.println("Nadador Categoria Adulto");
		}
		else{
			System.out.println("Nadador não apto para nenhuma categoria.");
		}
		read.close();
	}
}