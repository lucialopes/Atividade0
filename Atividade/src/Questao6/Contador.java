package Questao6;

public class Contador {

	private int valor;
	private boolean incremento = true;


	public Contador() {
		    this.valor = 0;
		}
	

	public void Incrementar(){
		valor = valor +1;
		this.incremento = false;
		
	} 
	
	public int getValor(){
		return valor;
	}
	
	public boolean desfaz(){
		if(!incremento){
		    valor = valor - 1;
		  return true;
		}
		else
		{
		    System.out.println(" você já desfez o ultimo incremento ");
		return false;
		
		}
    }

	

}
