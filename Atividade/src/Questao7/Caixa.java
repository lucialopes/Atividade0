package Questao7;

import java.util.ArrayList;

public class Caixa {
	
	static ArrayList<String> filaDeEspera = new ArrayList<String> ();
	

	public void proximo(){
		ArrayList<String> a = new ArrayList<String> ();
		for(int i=1;i<filaDeEspera.size();i++)
			a.add(filaDeEspera.get(i));
	   }


 }





