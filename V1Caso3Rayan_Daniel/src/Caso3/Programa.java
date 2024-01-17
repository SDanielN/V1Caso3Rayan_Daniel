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
}