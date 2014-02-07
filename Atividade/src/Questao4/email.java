package Questao4;

public class email {

	private String endOrigem;
	private String endDestino;
	private String mensagem;
	private String data;
	private String anexo1;
	private String anexo2;
	private String anexo3;
	public String getEndOrigem() {
		return endOrigem;
	}
	public void setEndOrigem(String endOrigem) {
		this.endOrigem = endOrigem;
	}
	public String getEndDestino() {
		return endDestino;
	}
	public void setEndDestino(String endDestino) {
		this.endDestino = endDestino;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getAnexo1() {
		return anexo1;
	}
	public void setAnexo1(String anexo1) {
		if (anexo1 != null){
			if ((anexo1 != anexo2) && (anexo1 != anexo3)){
				this.anexo1 = anexo1;
	}
		}
	}
	public String getAnexo2() {
		return anexo2;
	}
	public void setAnexo2(String anexo2) {
		if (anexo2 != null){
			if ((anexo2 != anexo1) && (anexo2 != anexo3)){
				this.anexo2 = anexo2;
	}
		}
	}
	
	public String getAnexo3() {
		return anexo3;
	}
	public void setAnexo3(String anexo3) {
		if (anexo3 != null){
			if ((anexo3 != anexo2) && (anexo3 != anexo1)){
				this.anexo3 = anexo3;
	}
		}
	}
	}
	



