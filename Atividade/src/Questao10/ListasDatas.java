package Questao10;

public class ListasDatas {
	String [] listaDatas = new String[5];

	public String[] AumentarArray(String[] listap) {
		int tam = 2 * listap.length;
		String[] aux = new String[tam];
		for (int i = 0; i < listap.length; i++) {
			aux[i] = listap[i];
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
