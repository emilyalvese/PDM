package ex3;

public class MainForma {

	public static void main(String[] args) {
		Forma f1 = new Retangulo(5, 10);
		Forma f2 = new Quadrado(7);
		Forma f3 = new Circulo(4);

		System.out.println("Área do Retângulo: " + f1.area());
		System.out.println("Perímetro do Retângulo: " + f1.perimetro());
		System.out.println("Área do Quadrado: " + f2.area());
		System.out.println("Perímetro do Quadrado: " + f2.perimetro());
		System.out.println("Área do Círculo: " + f3.area());
		System.out.println("Perímetro do Círculo: " + f3.perimetro());
	}

}
