package Questao7;

public class principal {

	public static void main(String[] args) {

		Caixa a1 = new Caixa();
		Caixa a2 = new Caixa();
		Caixa a3 = new Caixa();
		
		Caixa.filaEspera.add("Ann");
		Caixa.filaEspera.add("Bnn");
		Caixa.filaEspera.add("Cjnn");
	
		
		for (String se : a1.filaEspera) {
			System.out.println(se);
		}
		
		a2.proximo();
		
		for (String se : a1.filaEspera) {
			System.out.println(se);
		}
			
		a3.proximo();
		
		for (String se : a1.filaEspera) {
			System.out.println(se);
		}
	}

}