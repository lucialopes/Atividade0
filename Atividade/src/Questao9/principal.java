package Questao9;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {

	static Scanner scr = new Scanner(System.in);
	static ArrayList<String> listaPalavras = new ArrayList<String>();
	
	
	public static int StringMaior(ArrayList<String> listaPalavras) {
		int tam = 0;
		for (int i = 0; i < listaPalavras.size(); i++) {
			if (listaPalavras.get(i).length() > tam)
				tam = listaPalavras.get(i).length();
		}

		return tam;
	}
	
	public static String concatenizacao(ArrayList<String> listaPalavras) {
		String auxi = new String();
		for (int i = 0; i < listaPalavras.size(); i++) {
			auxi = auxi + listaPalavras.get(i);
		}
		return auxi;
	}

	public static boolean VerificacaoDeStrings(String p) {
		int tam;
		if (listaPalavras.size() < 15)
			tam = listaPalavras.size();
		else
			tam = 15;
		for (int i = 0; i < tam; i++) {
			if (listaPalavras.get(i).equals(p))
				return true;
		}
		System.out.println("--");
		return false;

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p = true;
		String p1;
		String test;
		System.out.println("Digite a primeira palavra: ");
		p1 = scr.nextLine();
		listaPalavras.add(p1);

		while (p) {
			test = scr.nextLine();
			if (VerificacaoDeStrings(test))
				p = false;
			else {
				listaPalavras.add(test);
			}

		}

		System.out.println("Numero de Strings validas: " + listaPalavras.size());
		System.out.println("Maior String é : " + StringMaior(listaPalavras));
		System.out.println("Concatenação das Strings: " +concatenizacao(listaPalavras));
			

	}

}
