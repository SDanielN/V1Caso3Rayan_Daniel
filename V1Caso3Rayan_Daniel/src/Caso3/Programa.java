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

	}

	// Calculamos el área del triangulo
	public static double calcularArea(double lado1, double lado2) {

		double area = lado1 * lado2 / 2;
		return area;
	}
}