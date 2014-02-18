package Questao5;

public class Circulo implements FormaGeometrica {

	private final double pi = 3.14;
	private double raio;

	
	public double getArea() {
		
		return pi*raio*raio;
	}

	public double getPerimetro() {
		return 2*pi*raio;
	}

	public void Desenhar() {
		System.out.println("Desenho de um circulo!");

	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
			


}

