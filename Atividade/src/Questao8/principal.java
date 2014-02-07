package Questao8;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList palavras = new ArrayList<String>();
		System.out.println(" Informe a palavra");
		palavras.add(sc.nextLine());
		int cont = 0;
		String test;
		test = sc.nextLine();
		while (!(test.equals(palavras.get(cont)))) {
			palavras.add(test);
			cont++;
		}

		System.out.println("paro");
	}

}
