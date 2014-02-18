package Questao8;

import java.util.ArrayList;


import java.util.Scanner;

public class principal {
	
	public static int maiorString(ArrayList<String> listaDeString){
		int tam = 0;
		for (int i = 0; i < listaDeString.size(); i++) {
			if (listaDeString.get(i).length() > tam)
				tam = listaDeString.get(i).length();
		}
		
		return tam; // retorna o tamanho da palavra
	}

	public static String concatenar(ArrayList<String> listaDeString){
		String auxiliar = new String();
		for (int i = 0; i < listaDeString.size(); i++) {
			auxiliar = auxiliar + listaDeString.get(i);
		}
		return auxiliar; // concatenando Strings
	}
	
	
	public static void main(String[] args) {

		int maiorString;
		String teste = null;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaDeString = new ArrayList<String>();
		
		System.out.println("Digite a primeira palavra :");
		listaDeString.add(sc.next());
		
		teste = sc.next();
		while(!(listaDeString.get(listaDeString.size()-1).equals(teste))){
			listaDeString.add(teste);
			teste = sc.next();
		}
		
		System.out.println(" Strings validas: " + listaDeString.size());
		System.out.println("Maior String: " + maiorString(listaDeString));
		System.out.println("Concatenação Strings: " + concatenar(listaDeString));
				
	}

		}

		
	


