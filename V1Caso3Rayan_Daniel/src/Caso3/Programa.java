package Caso3;

import java.util.Scanner;

public class Programa {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// Pedimos los lados del triangulo
		System.out.println("Escribe la base del triangulo: ");
		double baseTriangulo = entrada.nextInt();

		System.out.println("Escribe la altura del triangulo: ");
		double alturaTriangulo = entrada.nextInt();

		System.out.println("El area del triangulo es de " + calcularArea(baseTriangulo, alturaTriangulo));
		// Solicitar al usuario que ingrese el radio de la circunferencia
		System.out.print("Ingrese el radio de la circunferencia: ");
		double radio = entrada.nextDouble();

		// Calcular el área y el perímetro
		double area = calcularArea(radio);
		double perimetro = calcularPerimetro(radio);

		// Mostrar los resultados
		System.out.println("Área de la circunferencia: " + area);
		System.out.println("Perímetro de la circunferencia: " + perimetro);

		// Pedimos los datos del cilindro
		System.out.println("Escribe el radio del cilindro: ");
		double radioCilindro = entrada.nextDouble();

		System.out.println("Escribe la altura del cilindro: ");
		double alturaCIlindro = entrada.nextDouble();

		System.out.println("El area del cilindro es de " + calcularArea(radioCilindro, alturaCIlindro));

		// Solicitar al usuario que ingrese la base del rectángulo
		System.out.print("Ingrese la base del rectángulo: ");
		double baseRec = entrada.nextDouble();

		// Solicitar al usuario que ingrese la altura del rectángulo
		System.out.print("Ingrese la altura del rectángulo: ");
		double alturaRec = entrada.nextDouble();

		// Calcular el área del rectángulo
		double areaRec = calcularAreaRectangulo(baseRec, alturaRec);

		// Mostrar el resultado
		System.out.println("Área del rectángulo: " + area);
		
	}

	// Calculamos el área del triangulo
	public static double calcularArea(double lado1, double lado2) {

		double area = lado1 * lado2 / 2;
		return area;
	}

	// Función para calcular el área de la circunferencia
	public static double calcularArea(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}

	// Función para calcular el perímetro de la circunferencia
	public static double calcularPerimetro(double radio) {
		return 2 * Math.PI * radio;
	}

	// Calculamos el área del cilindro
	public static double calcularAreaCilindro(double radio, double altura) {
		double area = 2 * 3.14 * radio * (radio + altura);
		return area;
	}

	// Función para calcular el área del rectángulo
	public static double calcularAreaRectangulo(double baseRec, double alturaRec) {
		return baseRec * alturaRec;
	}
	
	

}