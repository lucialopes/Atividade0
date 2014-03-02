package Questao3;

public class anexo {

	private String nome;
    private String texto;
	

  public String getNome() {
		return nome;
	}


	public void setNome(String nomeAnexo) {
		this.nome = nomeAnexo;
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

public int hashcode() {
final int entrada = 20;
int hash = 5;
hash = entrada * hash
+ (getTexto() != null ? getTexto().hashCode() : 0);

return hash;

}

public boolean equals(Object obj) {

if (obj == null) {
return false;
}

if (!(obj instanceof anexo)) {
return false;
}

final anexo anexo = (anexo) obj;

if (getNome() == null)
return false;

if (getTexto() == null)
return false;

return getTexto().equals(anexo.getTexto());

}


  public String toString() {
		return 	"\nAnexo:" +
				"Nome Anexo: " + getNome() +
				", Texto: " + getTexto();
	}
  
}