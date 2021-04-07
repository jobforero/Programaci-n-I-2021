package suma;

import java.util.Scanner;

public class Tareas_2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int op1 = 0;

		System.out.println("Tarea de la clase #2");
		System.out.println("Escoger un problema");
		System.out.println("1 - Calcular el área de un triangulo");
		System.out.println("2 - Calcular los grados Fahrenheit  ");
		System.out.println("3 - Calcular la deducciones de un Empleado");
		System.out.println("4 - Promedio en la calificación de un Estudiante");
		System.out.println("5 - Calcular el área de un círculo dado el radio");
		System.out.println(":");

		op1 = Integer.parseInt(teclado.next());

		switch (op1) {
		case 1:
			// 1 - Calcular el área de un triangulo
			CalcularTriangulo ct = new CalcularTriangulo();
			ct.ProcesaTR();

		case 2:
			// 2 - Calcular los grados Fahrenheit
			CalcularFahrenheit cf = new CalcularFahrenheit();
			cf.ProcesaF();

		case 3:
			// 3 - Calcular el salario de un Empleado
			CalcularSalario cs = new CalcularSalario();
			cs.ProcesaS();

		case 4:
			// 4 - Leer información de un estudiante
			LeerNombre ln = new LeerNombre();
			ln.ProcesaN();

		case 5:
			// 5 - Calcular el área de un círculo dado el radio
			CalcularCirculo cc = new CalcularCirculo();
			cc.ProcesaC();

			break;
		default:
			System.out.println("Ingreso una opción errada");
		}

	}

}

class CalcularTriangulo {
	private float base;
	private float altura;
	private float resultado;

	CalcularTriangulo() {
		base = 0;
		altura = 0;
		resultado = 0;
	}

	void ProcesaTR() {
		System.out.println("Calcular el área de un triangulo");
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introducir la base del triangulo");
		base = Float.parseFloat(teclado.next());

		System.out.println("Introducir la altura del triangulo");
		altura = Float.parseFloat(teclado.next());

		resultado = (base * altura) / 2;

		System.out.println("Los datos ingresados fueron. Base: " + base + " altura: " + altura
				+ "  dando como resultado un area de: " + resultado);
	}

}

class CalcularFahrenheit {
	private float Fahrenheit;
	private float centigrados;
	private float resultados;

	CalcularFahrenheit() {
		Fahrenheit = 0;
		centigrados = 0;
	}

	void ProcesaF() {
		System.out.println("Calcular los grados Fahrenheit");
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introducir la Centigrados");
		centigrados = Float.parseFloat(teclado.next());

		resultados = (centigrados * 1.8f) + 32;
		System.out.println("los Fahrenheit son : " + resultados);

	}
}

class CalcularSalario {
	private String Nombre;
	private float horas;
	private double tarifa;
	private double deducciones;

	CalcularSalario() {
		horas = 0;
		tarifa = 2.50;
	}

	void ProcesaS() {
		System.out.println("Calcular el Salario de un Empleado");
		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor introducir el nombre del empleado");
		Nombre = teclado.next();

		System.out.println("Por favor introducir las horas trabajadas");
		horas = Float.parseFloat(teclado.next());

		deducciones = tarifa * horas;

		System.out.println("El empleado " + Nombre + " tiene un total de deducciones " + deducciones);
	}
}

class LeerNombre {
	private String Nombre;
	private double notas1, notas2, notas3, cantidad;
	private double promedio;

	LeerNombre() {
		notas1 = 0;
		notas2 = 0;
		notas3 = 0;
		promedio = 0;
		cantidad = 3;
	}

	void ProcesaN() {
		System.out.println("Calcular la nota promedio del Estudiante");
		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor introducir el nombre del Estudiante");
		Nombre = teclado.next();

		System.out.println("Introducir la Nota numero 1");
		notas1 = Float.parseFloat(teclado.next());
		System.out.println("Introducir la Nota numero 2");
		notas2 = Float.parseFloat(teclado.next());
		System.out.println("Introducir la Nota numero 3");
		notas3 = Float.parseFloat(teclado.next());

		promedio = (notas1 + notas2 + notas3) / cantidad;

		System.out.println("El Estudiante = " + Nombre + " tiene un promedio en la nota de = " + promedio);
	}
}

class CalcularCirculo {
	private double area;
	private float radio;

	CalcularCirculo() {
		area = 0;
		radio = 0;
	}

	void ProcesaC() {
		System.out.println("Calcular el área de un círculo");
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introducir el radio del circulo");
		radio = Float.parseFloat(teclado.next());
		area = 3.1416 * Math.pow(radio, 2);

		System.out.println("El Circulo con radio " + radio + " tiene un area de " + area);
	}
}