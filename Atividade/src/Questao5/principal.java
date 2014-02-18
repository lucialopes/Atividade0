package Questao5;

public class principal {

		
		static Retangulo b = new Retangulo();
		static Circulo a = new Circulo();;
		

	public static void main(String[] args) {
		
			
		    a.setRaio(3);
			System.out.println(a.getArea());
			System.out.println(a.getPerimetro());
			
			b.setAltura(3);
			b.setBase(2);
			System.out.println(b.getArea());
			System.out.println(b.getPerimetro());

		}
		
		
	
}
	

