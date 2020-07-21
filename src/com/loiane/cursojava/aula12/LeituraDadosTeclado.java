package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A Sua altura é: " + altura);*/
		
		System.out.println("Digite seu primeiro nome, idade,quantidade de filhos,altura, se tem algum bichinho de estimação");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdDeFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Primeiro Nome:" + primeiroNome);
		System.out.println("Idade: "+ idade);
		System.out.println("Quantidade de Filhos: "+ qtdDeFilhos);
		System.out.println("Altura: "+ altura);
		System.out.println("Tem Bichinho de Estimação: "+ temPet);
		
	}

}
