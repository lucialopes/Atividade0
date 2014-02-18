package Questao5;

public class Retangulo implements FormaGeometrica {

	private double base;
	private double altura;
	
	public double getArea() {
		// TODO Auto-generated method stub
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

	

	
	}
	
