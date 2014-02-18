package Questao10;

public class ListasDatas {
	String [] listaDatas = new String[5];

	public String[] AumentarArray(String[] listapa) {
		int tam = 2 * listapa.length;
		String[] aux = new String[tam];
		for (int i = 0; i < listapa.length; i++) {
			aux[i] = listapa[i];
		}

		return aux;

	}
	
	public void inserir(String data) {
		         int cont = 0;
		while (listaDatas[cont] != null && cont < listaDatas.length)
			cont++;
		if (cont >= listaDatas.length) {
			listaDatas = AumentarArray(listaDatas);
		}
		listaDatas[cont] = data;
	}
	
	public int VerificarDataExistente(String data) {
		for (int i = 0; i < listaDatas.length; i++) {
			if (listaDatas[i] != null) {
				if (listaDatas[i].equals(data))
					return i;

			}
		}

		return 0;
	}
	
	public boolean removerData(String data) {
		if(VerificarDataExistente(data) == 0)
			return false;
		else
			listaDatas[VerificarDataExistente(data)] = null;
		return true;
		
	}


}
