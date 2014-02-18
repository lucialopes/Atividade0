package Questao7;

import java.util.ArrayList;

public class Caixa {
	
	static ArrayList<String> filaEspera = new ArrayList<String> ();
	

	public void proximo(){
		ArrayList<String> a1 = new ArrayList<String> ();
		for(int i=1;i<filaEspera.size();i++)
			a1.add(filaEspera.get(i));
	   }
         

 }






