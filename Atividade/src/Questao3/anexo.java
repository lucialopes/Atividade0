package Questao3;

public class anexo {

	private String nomeAnexo;
	private String texto;
	
	

  public String getNomeAnexo() {
		return nomeAnexo;
	}


	public void setNomeAnexo(String nomeAnexo) {
		this.nomeAnexo = nomeAnexo;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


  public boolean contain(String pr){
	if (texto.contains(pr))
		return true;
	else
		return false;
   }

}