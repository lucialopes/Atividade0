package Questao5;

public class Retangulo implements FormaGeometrica {

	private double base;
	private double altura;
	
	public double getArea() {
		
		return base * altura;
	}

	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*(base+altura);
	}

	public void Desenhar() {
		// TODO Auto-generated method stub
		System.out.println("Desenho de um retangulo!");
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int hashcode() {
		final int entrada = 20;
		int hash = 5;
		hash = entrada * hash + (getArea() != 0 ? getArea().hashCode() : 0);
		return hash;

	}

	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Retangulo)) {
			return false;
}

		final Retangulo retangulo = (Retangulo) obj;

		if (getArea() == 0)
			return false;

		if (getPerimetro() == 0)
			return false;

		if (getArea() != retangulo.getArea())

			return false;

		if (getPerimetro() != retangulo.getPerimetro())

			return false;

		return true;

	}

	public String toString() {
		return 	"\nReatngulo:" +
				"Telefone: " + getAltura() +
				", Tipo de Cntato: " + getBase();
	}

	
	}
	
