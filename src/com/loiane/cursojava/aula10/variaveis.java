package com.loiane.cursojava.aula10;

public class variaveis {

	public static void main(String[] args) {
		
		//convenção java
		int idade = 20; 
		String nome = "Loiane";
		String NomeDoMeuCachorro = "totó";
		String Ano2014 = "2014";
		
		//aceito , mas não uso
		int _idade;
		int $idade;
		
		//não é convenção java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro1;
		String nomeDoMeucachorro;
		
		idade = 25;
		
		System.out.println("Idade = "+ idade);
		System.out.println("Nome = "+ nome);
		
		//má pratica
		int a = 10;
		String b = "Loiane";
		
	}

}
